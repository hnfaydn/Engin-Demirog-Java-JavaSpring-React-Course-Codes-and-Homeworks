package validationPackage.concrete;

import validationPackage.abstracts.PasswordValidatorService;
import entitiy.concrete.User;

public class PasswordValidatorManager implements PasswordValidatorService {
    @Override
    public boolean passwordValidator(User user) {
        if((user.getUserPassword().isEmpty())||(user.getUserPassword().length()<6)){
            System.out.println("Password have to have at least 6 character");
            return false;
        }
        return true;
    }
}
