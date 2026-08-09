import java.util.Scanner;

public class QueOnBreak {
    public static void main(String[] args) {
        //Keep entering numbers till user enters multiples of 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while (num%10 != 0) {
            System.out.println("Your number is: "+num);
            System.out.println("Enter a number");
            num = sc.nextInt();
        }
    }
}
