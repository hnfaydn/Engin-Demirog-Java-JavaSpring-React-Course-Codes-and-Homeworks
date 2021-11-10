package business.abstracts;

import entitiy.concrete.User;

import java.util.*;

public interface RegistrationService {

    void registrationNewUser(User user);
    void deleteUser(User user);
    void updateUserInformation(User user);


}
