package validationPackage.concrete;

import validationPackage.abstracts.FirstNameValidationService;
import entitiy.concrete.User;

public class FirstNameValidationManager implements FirstNameValidationService {
    @Override
    public boolean firstNameValidator(User user) {
        if((user.getUserFirstName().isEmpty()) | (user.getUserFirstName().length()<2)){
            System.out.println("Name have to have at least 3 character");
            return false;
        }
    return true;
    }
}
