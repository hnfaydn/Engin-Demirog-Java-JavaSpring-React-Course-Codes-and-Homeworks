package validationPackage.abstracts;

import entitiy.concrete.User;

public interface PasswordValidatorService {
    boolean passwordValidator(User user);
}
