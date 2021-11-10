package business.abstracts;

import entitiy.concrete.User;

public interface GoogleEmailVerificationService {
    boolean googleAccountEntered(User user);
    boolean googleAccountCompleted(User user);
}
