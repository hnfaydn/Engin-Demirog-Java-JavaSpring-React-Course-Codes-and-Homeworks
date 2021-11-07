package Concrete;

import Abstract.*;

import Entities.*;

public class NeroCustomerManager extends BaseCustomerManager {

    //If nero need mernis check system codes

//    ICustomerCheckService _customerCheckService;
//    public NeroCustomerManager(ICustomerCheckService customerCheckService){
//        _customerCheckService=customerCheckService;
//    }
//    @Override
//    public void save(Customer customer) throws Exception {
//        if (_customerCheckService.CheckIfRealPerson(customer)) {
//            super.save(customer);
//
//        }else {
//            System.out.println("Not a valid person");
//        }
//    }

    public void save(Customer customer) throws Exception {

        super.save(customer);
    }
}
