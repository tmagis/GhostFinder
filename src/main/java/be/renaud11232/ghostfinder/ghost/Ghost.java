package be.renaud11232.ghostfinder.ghost;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public enum Ghost {

    BANSHEE("Banshee", Evidence.FINGERPRINTS, Evidence.GHOST_ORBS, Evidence.DOTS_PROJECTOR),
    DEMON("Demon", Evidence.FREEZING_TEMPERATURES, Evidence.GHOST_WRITING, Evidence.FINGERPRINTS),
    JINN("Jinn", Evidence.EMF_LEVEL_5, Evidence.FINGERPRINTS, Evidence.FREEZING_TEMPERATURES),
    MARE("Mare", Evidence.SPIRIT_BOX, Evidence.GHOST_ORBS, Evidence.GHOST_WRITING),
    ONI("Oni", Evidence.EMF_LEVEL_5, Evidence.FREEZING_TEMPERATURES, Evidence.DOTS_PROJECTOR),
    PHANTOM("Phantom", Evidence.SPIRIT_BOX, Evidence.FINGERPRINTS, Evidence.DOTS_PROJECTOR),
    POLTERGEIST("Poltergeist", Evidence.FINGERPRINTS, Evidence.GHOST_WRITING, Evidence.SPIRIT_BOX),
    REVENANT("Revenant", Evidence.GHOST_ORBS, Evidence.GHOST_WRITING, Evidence.FREEZING_TEMPERATURES),
    SHADE("Shade", Evidence.EMF_LEVEL_5, Evidence.GHOST_WRITING, Evidence.FREEZING_TEMPERATURES),
    SPIRIT("Spirit", Evidence.EMF_LEVEL_5, Evidence.SPIRIT_BOX, Evidence.GHOST_WRITING),
    WRAITH("Wraith", Evidence.EMF_LEVEL_5, Evidence.SPIRIT_BOX, Evidence.DOTS_PROJECTOR),
    YUREI("Yurei", Evidence.GHOST_ORBS, Evidence.FREEZING_TEMPERATURES, Evidence.DOTS_PROJECTOR),
    HANTU("Hantu", Evidence.FINGERPRINTS, Evidence.GHOST_ORBS, Evidence.FREEZING_TEMPERATURES),
    YOKAI("Yokai", Evidence.SPIRIT_BOX, Evidence.GHOST_ORBS, Evidence.DOTS_PROJECTOR),
    GORYO("Goryo", Evidence.EMF_LEVEL_5, Evidence.FINGERPRINTS, Evidence.DOTS_PROJECTOR),
    MYLING("Myling", Evidence.EMF_LEVEL_5, Evidence.FINGERPRINTS, Evidence.GHOST_WRITING);

    private final String name;
    private final Collection<Evidence> evidences;

    Ghost(String name, Evidence... evidences) {
        this.name = name;
        this.evidences = Collections.unmodifiableList(Arrays.asList(evidences));
    }

    public Collection<Evidence> getEvidences() {
        return evidences;
    }

    @Override
    public String toString() {
        return name;
    }

}
