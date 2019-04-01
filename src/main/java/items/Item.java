package items;

import behaviours.ISell;

public class Item implements ISell {

    private ItemType type;
    private String description;
    private double buyingPrice, sellingPrice;

    public Item(ItemType type, String description, double buyingPrice, double sellingPrice){
        this.type = type;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }


}
