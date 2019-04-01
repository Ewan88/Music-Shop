import behaviours.ISell;
import items.Item;
import items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class SaleTest {

    ISell guitarString;

    @Before
    public void setup(){
        guitarString = new Item(ItemType.GUITAR_STRINGS, "Ernie Ball Slinky", 3.00, 5.99);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.99, guitarString.calculateMarkup(), 0.0);
    }


}
