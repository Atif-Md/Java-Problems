import java.util.Scanner;

public class QueOnContinue {
    public static void main(String[] args) {
        //Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if( num%10 == 0)
                continue;
            System.out.println("Entered number is: "+num);
        } while(true);
    }
}
