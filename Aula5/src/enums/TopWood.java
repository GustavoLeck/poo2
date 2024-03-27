package enums;

public enum TopWood {
    ALDER,
    BASSWOOD;

    public String toString() {
        switch (this) {
            case ALDER:
                return "Alder";
            case BASSWOOD:
                return "Basswood";
            default:
                return "Error: enum Backwood";
        }
    }
}
