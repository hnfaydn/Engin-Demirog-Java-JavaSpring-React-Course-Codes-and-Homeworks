package Abstract;

import Entities.*;
import Concrete.*;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public  void save(Customer customer) throws Exception {
        System.out.println("Saved to db : "+customer.getFirstName());
    }
}
