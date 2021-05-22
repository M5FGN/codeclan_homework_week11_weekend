public class Pilot extends Crew {

    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence) {
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }
}

