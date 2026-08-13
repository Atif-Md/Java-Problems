import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        //Check if a number is prime or not
        loop:
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check if it is prime or not:");
            int num = sc.nextInt();

            boolean isPrime = true;
            for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
                if( num%i == 0)
                    isPrime = false;
            }

            if(isPrime)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is not a prime number");

            System.out.println("Do you want to check more number? Press 1 for yes and 0 for no: ");
            int check = sc.nextInt();

            if (check == 0) {
                break loop;
            }
        }

    }
}
