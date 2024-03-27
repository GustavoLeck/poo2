import javax.swing.text.Style;

import enums.*;

public class MandolinSpec extends InstrumentSpec {
    private Estilo style;

    public MandolinSpec(Builder builder, Type type, BackWood backWood, TopWood topWood, Model model,
            Estilo style) {
        super(builder, type, backWood, topWood, model);
        this.style = style;
    }

    public Estilo getStyle() {
        return this.style;
    }

    public boolean matches(InstrumentSpec matcheSpec) {
        if (!super.matches(matcheSpec)) {
            return false;
        }
        if (!(matcheSpec instanceof MandolinSpec)) {
            return false;
        }
        MandolinSpec spec = (MandolinSpec) matcheSpec;
        if (this.style != spec.getStyle()) {
            return false;
        }
        return true;
    }

}
