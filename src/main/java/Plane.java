public class Plane {

    private String planeId;
    private PlaneType planeType;

    public Plane(String planeId, PlaneType planeType) {
        this.planeId = planeId;
        this.planeType = planeType;
    }

    public String getPlaneId() {
        return planeId;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int getTotalWeight() {
        return planeType.getTotalWeight();
    }

}
