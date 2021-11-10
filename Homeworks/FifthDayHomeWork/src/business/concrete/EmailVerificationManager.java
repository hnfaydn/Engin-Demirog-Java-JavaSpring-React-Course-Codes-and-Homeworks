package business.concrete;

import business.abstracts.EmailVerificationService;
import entitiy.concrete.User;

public class EmailVerificationManager implements EmailVerificationService{
    @Override
    public boolean verificationSend(User user) {
        System.out.println("Verification mail sent to "+user.getUserEmailAdress());
        return true;

    }

    @Override
    public boolean verificationComplete(User user) {
        if(verificationSend(user)) {
            System.out.println(user.getUserEmailAdress() + " verification completed successfully.");
            return true;
        }
        else{
            return false;
        }
    }
}
