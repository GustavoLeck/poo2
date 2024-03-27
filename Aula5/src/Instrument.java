public abstract class Instrument {
    private String serialNumber;
    private Double price;
    private InstrumentSpec InstrumentSpec;

    public Instrument(String serialNumber, Double price, InstrumentSpec InstrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.InstrumentSpec = InstrumentSpec;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
        return;
    }

    public InstrumentSpec getSpec() {
        return this.InstrumentSpec;
    }

    public String toString() {
        return "{".concat(this.serialNumber)
                .concat(", ")
                .concat(this.price.toString())
                .concat(", ")
                .concat(this.InstrumentSpec.getBackWood().toString())
                .concat(", ")
                .concat(this.InstrumentSpec.getBuilder().toString())
                .concat(", ")
                .concat(this.InstrumentSpec.getModel().toString())
                .concat("}")
                .concat(this.InstrumentSpec.getTopWood().toString())
                .concat("}")
                .concat(this.InstrumentSpec.getType().toString())
                .concat("}");
    }
}