import enums.*;

public class GuitarSpec {
    private Builder builder;
    private Type type;
    private BackWood backWood;
    private TopWood topWood;
    private Model model;

    public GuitarSpec(Model model, Builder builder, Type type, BackWood backWood, TopWood topWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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

    public String toString() {
        return "{".concat(this.builder.toString())
                .concat(", ")
                .concat(this.type.toString())
                .concat(", ")
                .concat(this.backWood.toString())
                .concat(", ")
                .concat(this.topWood.toString())
                .concat("}");
    }

}
