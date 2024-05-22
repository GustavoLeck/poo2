package enums;

public enum ModeloCarro {
    CRUZE,
    CAPTIVA,
    CELTA,
    CLASSIC,
    VECTRA,
    UNO;

    public String toString() {
        switch (this) {
            case CRUZE:
                return "Cruze";
            case CAPTIVA:
                return "Captiva";
            case CELTA:
                return "Celta";
            case CLASSIC:
                return "Classic";
            case UNO:
                return "Uno";
            case VECTRA:
                return "Vectra";
            default:
                return "Uno";
        }
    }
}
