import java.util.Scanner;

public class CheckingPrime {

    static boolean isPrime(int num, int i) {
        if(i==1)
            return true;
        else if(num%i==0)
            return false;
        else 
            return isPrime(num, --i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int num = sc.nextInt();

        if (num==1)
            System.out.println("Given number is a prime number");
        else
            System.out.println((isPrime(num, num/2)?"Given Number is a prime number":"Given number is not a prime number"));


    }
}
