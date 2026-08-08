import java.util.ArrayList;
import java.util.Scanner;

/**
 * FibonacciSeries
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int a=0;
        int b=1;

        al.add(a);
        al.add(b);

        for(int i=1;i<=n-2;i++) {
            int c=a+b;
            al.add(c);
            a=b;
            b=c;
        }

        System.out.println(al);
    }    
}