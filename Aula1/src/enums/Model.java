package enums;

public enum Model {
    STRATOCASTER,
    LES_PAUL;

    public String toString() {
        switch (this) {
            case STRATOCASTER:
                return "Stratocaster";
            case LES_PAUL:
                return "Les Paul";
            default:
                return "Error: Enum Model";
        }
    }
}
