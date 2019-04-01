import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell object){
        this.stock.add(object);
    }

    public void removeFromStock(ISell object){
        this.stock.remove(object);
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public double calculateProfit() {
        double total = 0.0;
        for (ISell object : this.stock){
            total += object.calculateMarkup();
        }
        return total;
    }
}
