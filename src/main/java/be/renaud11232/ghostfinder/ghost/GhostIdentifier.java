package be.renaud11232.ghostfinder.ghost;

import java.util.*;
import java.util.stream.Collectors;

public class GhostIdentifier {

    private final Set<Evidence> foundEvidences;
    private final Set<Evidence> rejectedEvidences;

    public GhostIdentifier() {
        this.foundEvidences = new HashSet<>();
        this.rejectedEvidences = new HashSet<>();
    }

    public void addFoundEvidence(Evidence evidence) {
        foundEvidences.add(evidence);
        rejectedEvidences.remove(evidence);
    }

    public void removeFoundEvidence(Evidence evidence) {
        foundEvidences.remove(evidence);
    }

    public void addRejectedEvidence(Evidence evidence) {
        rejectedEvidences.add(evidence);
        foundEvidences.remove(evidence);
    }

    public void removeRejectedEvidence(Evidence evidence) {
        rejectedEvidences.remove(evidence);
    }

    public Collection<Evidence> getCommonEvidence() {
        Collection<Ghost> possibleGhosts = getPossibleGhosts();
        return possibleGhosts.stream().flatMap(
                ghost -> ghost.getEvidences().stream()
        ).distinct().filter(
                evidence -> !foundEvidences.contains(evidence) && possibleGhosts.stream().allMatch(
                        ghost -> ghost.getEvidences().contains(evidence)
                )
        ).collect(Collectors.toSet());
    }

    public Collection<Evidence> getImpossibleEvidence() {
        return Arrays.stream(Evidence.values()).filter(
                evidence -> !rejectedEvidences.contains(evidence) && getPossibleGhosts().stream().noneMatch(
                        ghost -> ghost.getEvidences().contains(evidence)
                )
        ).collect(Collectors.toSet());
    }

    public Collection<Ghost> getPossibleGhosts() {
        return Arrays.stream(Ghost.values()).filter(
                ghost -> ghost.getEvidences().containsAll(foundEvidences) && rejectedEvidences.stream().noneMatch(
                        evidence -> ghost.getEvidences().contains(evidence)
                )
        ).collect(Collectors.toSet());
    }
}
