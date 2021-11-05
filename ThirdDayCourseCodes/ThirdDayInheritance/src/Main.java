public class Main {
    public static void main(String[] args) {
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber="12345";


        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber="789";

        SendikaCustomer yenisendika = new SendikaCustomer();
        yenisendika.customerNumber="99999";

        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(engin);
//        customerManager.add(hepsiburada);
//        customerManager.add(yenisendika);

        Customer[] customers = {engin,hepsiburada, yenisendika};

        customerManager.addMultiple(customers);
    }
}
