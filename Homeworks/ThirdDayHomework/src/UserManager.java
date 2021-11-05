public class UserManager {

    public void emailAdressChanger(User user){
        System.out.println("E-mail address of "+user.getName()+" "+user.getSurName()+" has changed");
    }

    public void emailSenderForSingleUser(User user){
        System.out.println("Required e-mail has sent to "+user.getName()+" "+user.getSurName());
    }
    public void emailSenderForAllUsers(User[] users){
        for(User user:users){
         emailSenderForSingleUser(user);
        }
    }
}
