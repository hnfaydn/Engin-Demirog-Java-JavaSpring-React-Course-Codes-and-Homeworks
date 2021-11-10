package validationPackage.abstracts;

import entitiy.concrete.User;

public interface EmailRegexCheckService {
    boolean emailRegexValidation(User user);
}
