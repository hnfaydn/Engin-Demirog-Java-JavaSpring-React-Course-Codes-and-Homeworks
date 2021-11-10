import business.abstracts.RegistrationService;
import business.concrete.EmailVerificationManager;
import business.concrete.GoogleEmailVerificationManager;
import business.concrete.RegistrationManager;
import core.abstracts.OutSourceService;
import core.concrete.OutSourceAdapter;
import dataAccess.concrete.DaoManager;
import entitiy.concrete.User;
import validationPackage.concrete.OverallValidatorManager;

public class Main {
    public static void main(String[] args) {
        User googleUserSimulation = new User(1,"Mehmet Hanifi","Aydın","google","123456789");
        User emailUserSimulation = new User(2,"Mehmet Hanifi","Aydın","hnfaydn@gmail.com","123456789");
        User wrongEmailUserSimulation = new User(2,"Mehmet Hanifi","Aydın","hnfaydn","123456789");
        User wrongFirstNameUserSimulation = new User(2,"M","Aydın","hnfaydn@gmail.com","123456789");
        User wrongLastNameUserSimulation = new User(2,"Mehmet Hanifi","A","hnfaydn@gmail.com","123456789");
        User wrongPasswordUserSimulation = new User(2,"Mehmet Hanifi","Aydın","hnfaydn@gmail.com","123");
        User uniqueEmailUserSimulation = new User(2,"Mehmet Hanifi","Aydın","hnfaydn@gmail.com","123456789");

        RegistrationService registrationService = new RegistrationManager(new DaoManager(),new OutSourceAdapter(),new EmailVerificationManager(),new GoogleEmailVerificationManager(),new OverallValidatorManager());

        registrationService.registrationNewUser(googleUserSimulation);
        System.out.println("-------------------------------------------------------------");
        registrationService.registrationNewUser(emailUserSimulation);
        System.out.println("-------------------------------------------------------------");
        registrationService.registrationNewUser(wrongEmailUserSimulation);
        System.out.println("-------------------------------------------------------------");
        registrationService.registrationNewUser(wrongFirstNameUserSimulation);
        System.out.println("-------------------------------------------------------------");
        registrationService.registrationNewUser(wrongLastNameUserSimulation);
        System.out.println("-------------------------------------------------------------");
        registrationService.registrationNewUser(wrongPasswordUserSimulation);






    }
}
