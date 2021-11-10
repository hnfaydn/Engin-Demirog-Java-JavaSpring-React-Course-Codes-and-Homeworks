package business.concrete;

import business.abstracts.RegistrationService;
import core.concrete.OutSourceAdapter;
import dataAccess.concrete.DaoManager;
import entitiy.concrete.User;
import validationPackage.concrete.OverallValidatorManager;

import java.util.ArrayList;
import java.util.List;

public class RegistrationManager implements RegistrationService {

    DaoManager daoManager;
    OutSourceAdapter outSourceAdapter;
    EmailVerificationManager emailVerificationManager;
    GoogleEmailVerificationManager googleEmailVerificationManager;
    OverallValidatorManager overallValidatorManager;
    String message;
    private User user;

    public RegistrationManager(DaoManager daoManager,
                               OutSourceAdapter outSourceAdapter,
                               EmailVerificationManager emailVerificationManager,
                               GoogleEmailVerificationManager googleEmailVerificationManager,
                               OverallValidatorManager overallValidatorManager) {
        super();
        this.daoManager = daoManager;
        this.outSourceAdapter=outSourceAdapter;
        this.emailVerificationManager=emailVerificationManager;
        this.googleEmailVerificationManager=googleEmailVerificationManager;
        this.overallValidatorManager=overallValidatorManager;

    }


    @Override
    public void registrationNewUser(User user) {

        if(user.getUserEmailAdress().equalsIgnoreCase("google")){
           googleEmailVerificationManager.googleAccountCompleted(user);
            this.outSourceAdapter.googleAccountRegistration(message);
            this.daoManager.add(user);
        }else{
            if(overallValidatorManager.validator(user)){
            emailVerificationManager.verificationComplete(user);
            this.daoManager.add(user);}
            else{
                return;
            }
        }
    }



    @Override
    public void deleteUser(User user) {

        System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" has deleted.");
        this.daoManager.delete(user);
    }

    @Override
    public void updateUserInformation(User user) {
        System.out.println(user.getUserFirstName()+" "+user.getUserLastName()+" has updated.");
        this.daoManager.update(user);
    }




}
