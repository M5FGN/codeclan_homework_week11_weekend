import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    // Plane type (capacity,total weight)
    Plane plane1;
    Plane plane2;
    Plane plane3;

     @Before
     public void setUp(){
         plane1 = new Plane(PlaneType.BOEING747);
         plane2 = new Plane(PlaneType.AIRBUS_A350);
         plane3 = new Plane(PlaneType.BOMBARDIER);
     }

     @Test
    public void planeHasType(){
         assertEquals(PlaneType.BOEING747, plane1.getPlaneType());
         assertEquals(PlaneType.AIRBUS_A350, plane2.getPlaneType());
         assertEquals(PlaneType.BOMBARDIER, plane3.getPlaneType());
     }

     @Test
    public void planeHasCapacity() {
         assertEquals(20, plane1.getCapacity());
         assertEquals(10, plane2.getCapacity());
         assertEquals(5, plane3.getCapacity());
     }

     @Test
    public void planeHasTotalWeight() {
         assertEquals(400, plane1.getTotalWeight());
         assertEquals(200, plane2.getTotalWeight());
         assertEquals(100, plane3.getTotalWeight());
     }

}
