public class Passenger {

    private String passengerName;
    private int numBags;

    public Passenger(String passengerName, int numBags) {
        this.passengerName = passengerName;
        this.numBags = numBags;
    }

    public String getName() {
        return passengerName;
    }

    public int getNumBags() {
        return numBags;
    }

}
