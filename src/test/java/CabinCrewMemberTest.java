import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;

    @Before
    public void setUp(){
        cabinCrewMember1 = new CabinCrewMember("Penny", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Stuart", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasCrewName(){
        assertEquals("Penny", cabinCrewMember1.getName());
        assertEquals("Stuart", cabinCrewMember2.getName());
    }

    @Test
    public void hasCrewRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember1.getRank());
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember2.getRank());
    }
}
