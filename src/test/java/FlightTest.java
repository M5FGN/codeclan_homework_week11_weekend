import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;


    @Before
    public void setUp() {
        flight = new Flight(plane3, "FLGT001", "LHR", "GLA","18.00");

        plane1 = new Plane("PL001", PlaneType.BOEING747);
        plane2 = new Plane("PL002", PlaneType.AIRBUS_A350);
        plane3 = new Plane("PL003", PlaneType.BOMBARDIER);

        pilot1 = new Pilot("Sheldon Cooper", Rank.CAPTAIN, "TBBT001");
        pilot2 = new Pilot("Amy Farrah Fowler", Rank.FIRST_OFFICER, "TBBT002");

        cabinCrewMember1 = new CabinCrewMember("Penny", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Stuart", Rank.FLIGHT_ATTENDANT);

        passenger1 = new Passenger("Monica Gellar", 2);
        passenger2 = new Passenger("Ross Gellar", 1);
        passenger3 = new Passenger("Joey Tribiani", 1);
        passenger4 = new Passenger("Rachel Green", 3);
        passenger5 = new Passenger("Pheobe Buffay", 2);
        passenger6 = new Passenger("Chandler Bing", 1);


    }

    @Test
    public void hasPilot(){
        flight.addPilot(pilot1);
        assertEquals(1, flight.countPilots());
    }

    @Test
    public void hasCrew(){
    flight.addCrew(cabinCrewMember1);
    flight.addCrew(cabinCrewMember2);
    assertEquals(2, flight.countCrew());
    }

    @Test
    public void hasPassengers(){
    flight.addPassenger(passenger1);
    flight.addPassenger(passenger2);
    flight.addPassenger(passenger3);
    assertEquals(3, flight.countPassengers());
    }

    @Test
    public void hasPlane(){
    assertEquals(plane3.getPlaneId(), flight.getPlane(plane3).getPlaneId());
    }

    @Test
    public void hasFlightNum(){
    assertEquals("FLGT001", flight.getFlightNum());
    }

    @Test
    public void hasDestination(){
    assertEquals("LHR", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
    assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
    assertEquals("18.00", flight.getDepartureTime());
    }

    @Test
    public void hasHowManySeats(){
        assertEquals(5, flight.getPlane(plane3).getCapacity());
    }

    @Test
    public void addPassengerIfCapacity(){
        flight.addPassengerIfCapacity(flight, plane3, passenger1);
        flight.addPassengerIfCapacity(flight, plane3, passenger2);
        flight.addPassengerIfCapacity(flight, plane3, passenger3);
        flight.addPassengerIfCapacity(flight, plane3, passenger4);
        flight.addPassengerIfCapacity(flight, plane3, passenger5);
        flight.addPassengerIfCapacity(flight, plane3, passenger6);
        assertEquals(5, flight.countPassengers());
    }

}
