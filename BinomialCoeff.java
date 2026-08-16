import java.util.Scanner;

public class BinomialCoeff {


    public static int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        else 
            return n * fact(n-1);
    }

    public static void binCoeff(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int binCoeff = n_fact / (r_fact * nmr_fact);

        System.out.println("Binomial coefficient is: "+binCoeff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        binCoeff(n, r);

    }
}