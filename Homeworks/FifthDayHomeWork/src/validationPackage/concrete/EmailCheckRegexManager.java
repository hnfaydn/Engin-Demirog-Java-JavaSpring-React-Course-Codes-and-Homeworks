package validationPackage.concrete;

import entitiy.concrete.User;
import validationPackage.abstracts.EmailRegexCheckService;

import java.util.regex.Pattern;

public class EmailCheckRegexManager implements EmailRegexCheckService {
    @Override
    public boolean emailRegexValidation(User user) {
        String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE );

        if(user.getUserEmailAdress().isEmpty()) {
            System.out.println("E-mail cannot be empty");
            return false;

        }else if(pattern.matcher(user.getUserEmailAdress()).find()==false) {
            System.out.println("E-mail format is wrong");
            return false;
        }else{
            return true;
        }

    }
}
