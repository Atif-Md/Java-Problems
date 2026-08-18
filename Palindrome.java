import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int num) {

        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int last_dig = temp % 10;
            reverse = reverse * 10 + last_dig;
            temp = temp / 10;
        }

        System.out.println(reverse);

        if (reverse == num)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isPalindrome(num))
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");

    }
}
