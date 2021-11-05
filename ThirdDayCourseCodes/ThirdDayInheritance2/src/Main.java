public class Main {
    public static void main(String[] args) {


        Logger[] loggers = new Logger[]{new EmailLogger(),new FileLogger(),new DatabaseLogger()};

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new FileLogger());


        for(Logger logger:loggers){
            logger.log();
        }

    }
}
