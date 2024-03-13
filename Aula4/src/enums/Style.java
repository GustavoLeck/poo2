package enums;

public enum Style {
    INLAY,
    ELETRIC;

    public String toString() {
        switch (this) {
            case INLAY:
                return "Inlay";
            case ELETRIC:
                return "Eletric";
            default:
                return "Error: Enum Builder";
        }
    }
}
