public class PrimeNumber {
    public static void main(String[] args) {
        int number = 23;
        int remainder;
        boolean isPrime = true;

        if(number<2)
        {
            System.out.println("Invalid number");
            return;
        }

        for(int i =2;i<number;i++)
        {
            if(number%i == 0)
            {
                isPrime=false;
            }
        }

        if(isPrime)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
