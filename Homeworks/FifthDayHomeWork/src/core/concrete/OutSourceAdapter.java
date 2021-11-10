package core.concrete;

import core.abstracts.OutSourceService;
import googleRegistrationPackage.*;

public class OutSourceAdapter implements OutSourceService {

    @Override
    public void googleAccountRegistration(String message) {

        GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
        googleRegistrationManager.registration(message);

    }
}
