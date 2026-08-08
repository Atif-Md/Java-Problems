import java.util.Scanner;

public class CalAPowerB {
    static int power(int a, int b) {
        if (b>=1)
            return a*power(a, b-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        System.out.println("Value of a to the power b is: "+power(a, b));

    }
}
