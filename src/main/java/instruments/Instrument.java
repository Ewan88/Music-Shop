package instruments;

import behaviours.*;

public abstract class Instrument implements IPlay, ISell {

    protected String material, color;
    protected InstrumentType type;
    protected double buyingPrice, sellingPrice;

    public Instrument(String material, String color, InstrumentType type, double buyingPrice, double sellingPrice){
        this.material = material;
        this.color = color;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String play(){
        return "la la la";
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }

}
