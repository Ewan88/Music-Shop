import behaviours.*;
import instruments.*;
import items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument guitar, trumpet;
    Item guitarString;

    @Before
    public void setup(){
        shop = new Shop();
        guitar = new Guitar("mahogany", "red", InstrumentType.ELECTRIC_GUITAR, 6, 300, 700);
        trumpet = new Trumpet("brass", "brass", InstrumentType.TRUMPET, 3, 150, 300);
        guitarString = new Item(ItemType.GUITAR_STRINGS, "Ernie Ball Slinky", 3.00, 5.99);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addToStock(guitar);
        shop.addToStock(guitarString);
        assertEquals(402.99, shop.calculateProfit(), 0.0);
    }


}
