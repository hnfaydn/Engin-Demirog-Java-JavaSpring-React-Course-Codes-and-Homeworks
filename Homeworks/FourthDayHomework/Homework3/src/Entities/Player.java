package Entities;

public class Player {
    private int playerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nationalityId;

    public Player(){

    }

    public Player(int playerId, String firstName, String lastName, String dateOfBirth, String nationalityId) {
        super();
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalId) {
        this.nationalityId = nationalId;
    }
}
