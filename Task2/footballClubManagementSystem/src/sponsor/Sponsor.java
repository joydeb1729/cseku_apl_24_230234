package sponsor;

public class Sponsor {
    /*
      The sponsor.Sponsor class represents an organization or individual providing financial support to the club, tracking their name,
      sponsorship amount, contract duration, and type of sponsorship.
      It includes the ability to extend sponsorship contracts.
     */
    private String name;
    private double sponsorshipAmount;
    private String contractDuration;
    private String sponsorType;

    public void extendContract(String additionalDuration) {
        this.contractDuration += " + " + additionalDuration;
    }
}
