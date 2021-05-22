import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void setUp() {
        pilot1 = new Pilot("Sheldon Cooper", Rank.CAPTAIN, "TBBT001");
        pilot2 = new Pilot("Amy Farrah Fowler", Rank.FIRST_OFFICER, "TBBT002");
    }

    @Test
    public void hasPilotName(){
        assertEquals("Sheldon Cooper", pilot1.getName());
        assertEquals("Amy Farrah Fowler", pilot2.getName());
    }

    @Test
    public void hasPilotRank(){
        assertEquals(Rank.CAPTAIN, pilot1.getRank());
        assertEquals(Rank.FIRST_OFFICER, pilot2.getRank());
    }

    @Test
    public void hasPilotLicense() {
        assertEquals("TBBT001", pilot1.getPilotLicence());
        assertEquals("TBBT002", pilot2.getPilotLicence());
    }

}
