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
            if (guitarNow.getBuilder() != searchGuitar.getBuilder()) {
                continue;
            }
            if (guitarNow.getModel() != searchGuitar.getModel()) {
                continue;
            }
            if (guitarNow.getType() != searchGuitar.getType()) {
                continue;
            }
            if (guitarNow.getBackWood() != searchGuitar.getBackWood()) {
                continue;
            }
            if (guitarNow.getTopWood() != searchGuitar.getTopWood()) {
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
