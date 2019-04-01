package instruments;

public class Guitar extends Instrument {

    int strings;

    public Guitar(String material, String color, InstrumentType type, int strings, double buyingPrice, double sellingPrice) {
        super(material, color, type, buyingPrice, sellingPrice);
        this.strings = strings;
    }
}
