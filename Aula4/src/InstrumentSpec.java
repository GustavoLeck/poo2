import enums.*;

public abstract class InstrumentSpec {
    private Builder builder;
    private Type type;
    private BackWood backWood;
    private TopWood topWood;
    private Model model;

    public InstrumentSpec(Builder builder, Type type, BackWood backWood, TopWood topWood, Model model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;

    }

    public Model getModel() {
        return this.model;
    }

    public void setModel(Model newPrice) {
        this.model = newPrice;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public BackWood getBackWood() {
        return backWood;
    }

    public TopWood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec specSearch) {
        if (this.builder == specSearch.getBuilder() &&
                this.type == specSearch.getType() &&
                this.backWood == specSearch.getBackWood() &&
                this.backWood == specSearch.getBackWood() &&
                this.topWood == specSearch.getTopWood() &&
                this.model == specSearch.getModel()) {
            return true;
        }
        return false;
    }

}
