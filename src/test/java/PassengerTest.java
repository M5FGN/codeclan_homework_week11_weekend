import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Monica Gellar", 2);
        passenger2 = new Passenger("Ross Gellar", 1);
    }

    @Test
    public void getPassengerName(){
        assertEquals("Monica Gellar", passenger1.getName());
        assertEquals("Ross Gellar", passenger2.getName());
    }

    @Test
    public void getPassengerNumBags(){
        assertEquals(2, passenger1.getNumBags());
        assertEquals(1, passenger2.getNumBags());
    }


}
