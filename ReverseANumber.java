import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        while ( num != 0) {
            int lastdigit = num % 10;
            reversed = reversed * 10 + lastdigit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
