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
}