public enum PlaneType {

    BOEING747(20, 400 ),
    AIRBUS_A350(10, 200),
    BOMBARDIER(5, 100);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
