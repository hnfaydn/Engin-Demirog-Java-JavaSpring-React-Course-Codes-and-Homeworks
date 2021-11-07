package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StartbucksCustomerManager extends BaseCustomerManager{

    ICustomerCheckService _customerCheckService;
    public StartbucksCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService=customerCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);

        }else {
            System.out.println("Not a valid person");
        }
    }


}
