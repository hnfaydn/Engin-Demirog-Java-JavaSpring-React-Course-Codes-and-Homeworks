package business.abstracts;

import entitiy.concrete.User;

public interface EmailVerificationService {

    boolean verificationSend(User user);

    boolean verificationComplete(User user);
}
