package validationPackage.concrete;

import entitiy.concrete.User;
import validationPackage.abstracts.*;

public class OverallValidatorManager implements OverallValidatorService {
    EmailCheckRegexManager emailCheckRegexManager = new EmailCheckRegexManager();
    FirstNameValidationManager firstNameValidationManager = new FirstNameValidationManager();
    LastNameValidatorManager lastNameValidatorManager = new LastNameValidatorManager();
    PasswordValidatorManager passwordValidatorManager = new PasswordValidatorManager();
    UniqueEmailValidationManager uniqueEmailValidationManager = new UniqueEmailValidationManager();

    @Override
    public boolean validator(User user) {
        if(emailCheckRegexManager.emailRegexValidation(user)&&
                firstNameValidationManager.firstNameValidator(user)&&
                lastNameValidatorManager.lastNameValidator(user)&&
                passwordValidatorManager.passwordValidator(user)&&
                uniqueEmailValidationManager.uniqueEmailCheck(user)
        ){
            System.out.println("Validation done successfully");
            return true;
        }else{
            System.out.println("Validation did not complete");
            return false;
        }
    }
}
