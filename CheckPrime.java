import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        //Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not:");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2 ; i < num ; i++) {
            if( num%i == 0)
                isPrime = false;
        }

        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
