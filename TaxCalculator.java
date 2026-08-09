import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if(income < 500000)
            tax = 0;
        else if(income >= 500000 && income < 1000000)
            tax = income * 0.2;
        else
            tax = income * 0.3;

        System.out.println("Your tax is: "+tax);

    }
}
