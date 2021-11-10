package dataAccess.concrete;

import dataAccess.abstracts.DaoService;
import entitiy.concrete.User;

public class DaoManager implements DaoService {

    @Override
    public void add(User user) {
            System.out.println(user.getUserFirstName()+" "+ user.getUserLastName()+" has registered to database with e-mail adress: "+ user.getUserEmailAdress());
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getUserFirstName()+" "+ user.getUserLastName()+" has deleted");

    }

    @Override
    public void update(User user) {
        System.out.println(user.getUserFirstName()+" "+ user.getUserLastName()+" has updated");

    }
}
