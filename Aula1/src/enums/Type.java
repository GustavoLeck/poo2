package enums;

public enum Type {
    ACOUSTIC,
    ELETRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELETRIC:
                return "Acoustic";
            default:
                return "Error: Enum Type";
        }
    }
}
