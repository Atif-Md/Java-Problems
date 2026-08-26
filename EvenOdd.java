import java.util.Scanner;

public class EvenOdd {


    public static boolean isEven(int n) {
        if(n%2 == 0)
            return true;
        return false;
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // System.out.println((num%2==0)?"Even Number":"Odd Number");


        if (isEven(num)) {
            System.out.println(num+" is an Even number");
        } else 
            System.out.println(num+" is an Odd number");

    }
}
