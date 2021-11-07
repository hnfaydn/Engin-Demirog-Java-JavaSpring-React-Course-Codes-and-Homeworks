import Abstract.BaseCustomerManager;
import Adopters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StartbucksCustomerManager;
import Entities.Customer;

public class Main {

        public static void main(String[] args) throws Exception {

                Customer customer1 = new Customer(1,"Mehmet Hanifi","Aydın","1995","11111111111");
                BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
                BaseCustomerManager startbucksCustomerManager = new StartbucksCustomerManager(new MernisServiceAdapter());

                System.out.println("For Nero (Without mernis check)");
                neroCustomerManager.save(customer1);

                System.out.println("For Starbuck (With mernis check)");
                startbucksCustomerManager.save(customer1);



        }

}
