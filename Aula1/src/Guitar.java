import enums.*;

public class Guitar {
    private String serialNumber;
    private Builder builder;
    private Model model;
    private Type type;
    private BackWood backWood;
    private TopWood topWood;
    private double price;

    public Guitar(String serialNumber, double price, Builder builder,
            Model model, Type type, BackWood backWood, TopWood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Model getModel() {
        return model;
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
        return "{".concat(this.serialNumber)
                .concat(", ")
                .concat(this.builder.toString())
                .concat(", ")
                .concat(this.model.toString())
                .concat(", ")
                .concat(this.type.toString())
                .concat(", ")
                .concat(this.backWood.toString())
                .concat(", ")
                .concat(this.topWood.toString())
                .concat("}");
    }
}