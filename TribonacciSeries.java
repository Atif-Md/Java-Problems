import java.util.ArrayList;
import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int num = sc.nextInt();

        int a=0;
        int b=1;
        int c=2;
        
        al.add(a);
        al.add(b);
        al.add(c);

        for(int i=1;i<=num-3;i++) {
            int d = a+b+c;
            al.add(d);

            a=b;
            b=c;
            c=d;
        }

        System.out.println(al);
    }
}
