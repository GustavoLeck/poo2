package enums;

public enum Builder {
    GIBSON,
    FENDER;

    public String toString() {
        switch (this) {
            case GIBSON:
                return "Gibson";
            case FENDER:
                return "Fender";
            default:
                return "Error: Enum Builder";

        }
    }
}
