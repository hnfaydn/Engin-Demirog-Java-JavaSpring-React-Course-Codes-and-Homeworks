package validationPackage.abstracts;

import entitiy.concrete.User;

public interface UniqueEmailValidationService {
    boolean uniqueEmailCheck(User user);


}
