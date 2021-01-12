package be.renaud11232.ghostfinder.ghost;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public enum Ghost {

    BANSHEE("Banshee", Evidence.EMF_LEVEL_5, Evidence.FINGERPRINTS, Evidence.FREEZING_TEMPERATURES),
    DEMON("Demon", Evidence.FREEZING_TEMPERATURES, Evidence.GHOST_WRITING, Evidence.SPIRIT_BOX),
    JINN("Jinn", Evidence.EMF_LEVEL_5, Evidence.GHOST_ORBS, Evidence.SPIRIT_BOX),
    MARE("Mare", Evidence.FREEZING_TEMPERATURES, Evidence.GHOST_ORBS, Evidence.SPIRIT_BOX),
    ONI("Oni", Evidence.EMF_LEVEL_5, Evidence.GHOST_WRITING, Evidence.SPIRIT_BOX),
    PHANTOM("Phantom", Evidence.EMF_LEVEL_5, Evidence.FREEZING_TEMPERATURES, Evidence.GHOST_ORBS),
    POLTERGEIST("Poltergeist", Evidence.FINGERPRINTS, Evidence.GHOST_ORBS, Evidence.SPIRIT_BOX),
    REVENANT("Revenant", Evidence.EMF_LEVEL_5, Evidence.FINGERPRINTS, Evidence.GHOST_WRITING),
    SHADE("Shade", Evidence.EMF_LEVEL_5, Evidence.GHOST_ORBS, Evidence.GHOST_WRITING),
    SPIRIT("Spirit", Evidence.FINGERPRINTS, Evidence.GHOST_WRITING, Evidence.SPIRIT_BOX),
    WRAITH("Wraith", Evidence.FINGERPRINTS, Evidence.FREEZING_TEMPERATURES, Evidence.SPIRIT_BOX),
    YUREI("Yurei", Evidence.FREEZING_TEMPERATURES, Evidence.GHOST_ORBS, Evidence.GHOST_WRITING);

    private final String name;
    private final Collection<Evidence> evidences;

    Ghost(String name, Evidence... evidences) {
        this.name = name;
        this.evidences = Collections.unmodifiableList(Arrays.asList(evidences));
    }

    public String getName() {
        return name;
    }

    public Collection<Evidence> getEvidences() {
        return evidences;
    }
}
