import java.util.*;

public class Inventory {
    private List<Guitar> Guitars;

    public Inventory() {
        Guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(
            String serialNumber,
            double price,
            GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
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
            if (guitarNow.getGuitarSpec().searchGuitar(searchGuitar.getGuitarSpec()))
                ;
            return guitarNow;
        }
        return null;
    }

    public String toString() {
        return this.Guitars.toString();
    }

}
