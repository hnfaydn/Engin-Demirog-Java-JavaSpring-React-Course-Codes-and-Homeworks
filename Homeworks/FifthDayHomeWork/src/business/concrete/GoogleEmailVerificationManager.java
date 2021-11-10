package business.concrete;

import business.abstracts.GoogleEmailVerificationService;
import entitiy.concrete.User;

public class GoogleEmailVerificationManager implements GoogleEmailVerificationService {
    @Override
    public boolean googleAccountEntered(User user) {
        System.out.println("Verification mail sent to "+user.getUserEmailAdress()+" account");
        return true;
    }

    @Override
    public boolean googleAccountCompleted(User user) {
        if(googleAccountEntered(user)) {
            System.out.println(user.getUserEmailAdress() + " verification completed successfully.");
            return true;
        }
        else{
            return false;
        }
    }
}
