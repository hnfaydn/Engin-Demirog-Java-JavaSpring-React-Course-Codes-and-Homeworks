package validationPackage.abstracts;

import entitiy.concrete.User;

public interface LastNameValidationService {
    boolean lastNameValidator(User user);
}
