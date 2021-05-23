import java.util.ArrayList;

public class Flight {

    public ArrayList<Pilot> pilots;
    public ArrayList<CabinCrewMember> cabinCrew;
    public ArrayList<Passenger> passengers;
    public Plane plane;
    public String flightNum;
    public String destination;
    public String departureAirport;
    public String departureTime;

    public Flight(Plane plane, String flightNum, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }


    public Plane getPlane(Plane plane) {
    return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }


    public int countPilots() {
        return this.pilots.size();
    }

    public void addCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public int countCrew(){
        return this.cabinCrew.size();
    }


    public int countPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addPassengerIfCapacity(Flight flight, Plane plane, Passenger passenger) {
        if (passengers.size() < flight.getPlane(plane).getCapacity()) {
            flight.addPassenger(passenger);
        }
    }

    public String flying() {
     String pilotToSpeak = pilots.get(0).getName();
     return pilotToSpeak + " says Thank-you for flying JavaAir";
    }

    public String crewSafety() {
        String crewToSpeak = cabinCrew.get(0).getName();
        return crewToSpeak + " says Fasten your Seatbelts";
    }
}
