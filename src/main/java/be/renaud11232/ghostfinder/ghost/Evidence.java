package be.renaud11232.ghostfinder.ghost;

public enum Evidence {

    EMF_LEVEL_5("EMF Level 5"),
    FINGERPRINTS("Fingerprints"),
    FREEZING_TEMPERATURES("Freezing Temperatures"),
    GHOST_ORBS("Ghost Orbs"),
    GHOST_WRITING("Ghost Writing"),
    SPIRIT_BOX("Spirit Box"),
    DOTS_PROJECTOR("D.O.T.S Projector");

    private final String name;

    Evidence(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
