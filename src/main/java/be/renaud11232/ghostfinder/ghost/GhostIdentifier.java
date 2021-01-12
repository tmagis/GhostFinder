package be.renaud11232.ghostfinder.ghost;

import java.util.*;

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

    public Collection<Evidence> getPossibleEvidences() {
        Set<Evidence> possibleEvidences = new HashSet<>();
        getPossibleGhosts().forEach(ghost -> possibleEvidences.addAll(ghost.getEvidences()));
        return possibleEvidences;
    }

    public Collection<Ghost> getPossibleGhosts() {
        Set<Ghost> possibleGhosts = new HashSet<>(Arrays.asList(Ghost.values()));
        foundEvidences.forEach(foundEvidence -> possibleGhosts.removeIf(ghost -> !ghost.getEvidences().contains(foundEvidence)));
        rejectedEvidences.forEach(rejectedEvidence -> possibleGhosts.removeIf(ghost -> ghost.getEvidences().contains(rejectedEvidence)));
        return possibleGhosts;
    }

}
