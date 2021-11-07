package Adopters;

import Abstract.*;
import Entities.*;
import MernisRefference.*;

public class MernisServiceAdapter implements ICustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        DBIKPSPublicSoap client = new DBIKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                Integer.parseInt(customer.getDateOfBirth()));

    }
}
