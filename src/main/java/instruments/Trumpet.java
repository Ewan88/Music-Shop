package instruments;

public class Trumpet extends Instrument {

    int valves;

    public Trumpet(String material, String color, InstrumentType type, int valves, double buyingPrice, double sellingPrice) {
        super(material, color, type, buyingPrice, sellingPrice);
        this.valves = valves;
    }

    @Override
    public String play(){
        return "toot toot";
    }
}
