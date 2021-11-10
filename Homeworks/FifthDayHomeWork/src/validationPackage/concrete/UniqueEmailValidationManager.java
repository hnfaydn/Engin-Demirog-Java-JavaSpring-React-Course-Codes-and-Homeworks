package validationPackage.concrete;

import entitiy.concrete.User;
import validationPackage.abstracts.UniqueEmailValidationService;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailValidationManager implements UniqueEmailValidationService {

    List<String> emailAddresses = new ArrayList<String>();
    @Override
    public boolean uniqueEmailCheck(User user) {
        if(emailAddresses.contains(user.getUserEmailAdress())){
            System.out.println("This e-mail address is already using");
            return false;
        }else{
            emailAddresses.add(user.getUserEmailAdress());
            return  true;
        }
    }
}
