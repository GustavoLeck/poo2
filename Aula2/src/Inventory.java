import java.util.*;
import enums.*;

public class Inventory {
    private List<Guitar> Guitars;

    public Inventory() {
        Guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(
            String serialNumber,
            double price,
            Builder builder,
            Model model,
            Type type,
            BackWood backWood,
            TopWood topWood) {

        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);

        this.Guitars.add(guitar);
        return;
    }

    public Guitar getGuitar(String serialNumber) {

        for (Guitar guitarNow : Guitars) {
            if (guitarNow.getSerialNumber() == serialNumber) {
                return guitarNow;
            }
        }
        return null;
    }

    public Guitar guitarSearch(Guitar searchGuitar) {

        for (Guitar guitarNow : Guitars) {
            GuitarSpec GuitarSpec = guitarNow.getGuitarSpec();
            if (GuitarSpec.getBuilder() != searchGuitar.getGuitarSpec().getBuilder()) {
                continue;
            }
            if (GuitarSpec.getModel() != searchGuitar.getGuitarSpec().getModel()) {
                continue;
            }
            if (GuitarSpec.getType() != searchGuitar.getGuitarSpec().getType()) {
                continue;
            }
            if (GuitarSpec.getBackWood() != searchGuitar.getGuitarSpec().getBackWood()) {
                continue;
            }
            if (GuitarSpec.getTopWood() != searchGuitar.getGuitarSpec().getTopWood()) {
                continue;
            }
            return guitarNow;
        }
        return null;
    }

    public String toString() {
        return this.Guitars.toString();
    }

}
