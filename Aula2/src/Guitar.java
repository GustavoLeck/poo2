import enums.*;

public class Guitar {
    private String serialNumber;
    private Model model;
    private Double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, Builder builder, Model model, Type type, BackWood backWood,
            TopWood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(model, builder, type, backWood, topWood);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public GuitarSpec getGuitarSpec() {
        return this.spec;
    }

    public String toString() {
        return "{".concat(this.serialNumber)
                .concat(", ")
                .concat(this.model.toString())
                .concat("}");
    }
}