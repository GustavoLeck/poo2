import enums.*;

public class GuitarSpec extends InstrumentSpec {
    private double numStrings;

    public GuitarSpec(Builder builder, Type type, BackWood backWood, TopWood topWood, Model model, double numStrings) {
        super(builder, type, backWood, topWood, model);
        this.numStrings = numStrings;
    }

    public double getNumStrings() {
        return this.numStrings;
    }

    public boolean matches(InstrumentSpec matcheSpec) {
        if (!super.matches(matcheSpec)) {
            return false;
        }
        if (!(matcheSpec instanceof GuitarSpec)) {
            return false;
        }
        GuitarSpec spec = (GuitarSpec) matcheSpec;
        if (this.numStrings != spec.getNumStrings()) {
            return false;
        }
        return true;
    }
}
