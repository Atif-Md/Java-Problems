import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        // Prints the sum of Even and Odd integers
        Scanner sc = new Scanner(System.in);
        
        int number, choice;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            System.out.println("Enter the number: ");
            number = sc.nextInt();

            if(number%2 == 0)
                sumEven += number;
            else
                sumOdd += number;

            System.out.println("Do you want to continue? Press 1 for Yes and 0 for No: ");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
