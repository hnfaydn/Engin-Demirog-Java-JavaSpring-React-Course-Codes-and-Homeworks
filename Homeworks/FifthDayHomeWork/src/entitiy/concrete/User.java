package entitiy.concrete;

import entitiy.abstacts.Entitiy;


public class User implements Entitiy {
    private int id;
    private String userFirstName;
    private String userLastName;
    private String userEmailAdress;
    private String userPassword;

    public User() {
    }

    public User(int id, String userFirstName, String userLastName, String userEmailAdress, String userPassword) {
        super();
        this.id = id;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmailAdress = userEmailAdress;
        this.userPassword = userPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmailAdress() {
        return userEmailAdress;
    }

    public void setUserEmailAdress(String userEmailAdress) {
        this.userEmailAdress = userEmailAdress;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
