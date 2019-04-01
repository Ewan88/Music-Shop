import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InstrumentTest {

    Instrument guitar, trumpet;

    @Before
    public void setup(){
        guitar = new Guitar("mahogany", "red", InstrumentType.ELECTRIC_GUITAR, 6, 300, 700);
        trumpet = new Trumpet("brass", "brass", InstrumentType.TRUMPET, 3, 150, 300);
    }

    @Test
    public void canPlay(){
        assertEquals("la la la", guitar.play());
    }

    @Test
    public void canOverride(){
        assertEquals("toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400, guitar.calculateMarkup(), 0.0);
        assertEquals(150, trumpet.calculateMarkup(), 0.0);
    }

}
