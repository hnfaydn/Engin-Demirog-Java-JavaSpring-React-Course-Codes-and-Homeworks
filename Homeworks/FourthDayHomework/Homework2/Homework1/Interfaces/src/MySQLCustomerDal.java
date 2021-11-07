public class MySQLCustomerDal implements  ICustomerDal, IRepository{

    @Override
    public void add() {
        System.out.println("MySQL eklendi");
    }
}
