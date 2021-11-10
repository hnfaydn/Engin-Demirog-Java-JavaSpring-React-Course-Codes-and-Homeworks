package validationPackage.concrete;

import validationPackage.abstracts.LastNameValidationService;
import entitiy.concrete.User;

public class LastNameValidatorManager implements LastNameValidationService {
    @Override
    public boolean lastNameValidator(User user) {
        if((user.getUserLastName().isEmpty())||(user.getUserLastName().length()<2)){
            System.out.println("last name have to have at least 3 character");
            return false;
        }
        return true;
    }
}
