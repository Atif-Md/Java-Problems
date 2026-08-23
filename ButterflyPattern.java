import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        // First half
        for(int i = 1 ; i <= rows ; i++) {
            // stars
            for(int j = 1 ; j <= i ; j++) {
                 System.out.print("* ");
            }

            // spaces
            for(int j = 1 ; j <= 2*(rows-i) ; j++) {
                System.out.print("  ");
            }

            // stars
            for(int j = 1 ; j <= i ; j++) {
                 System.out.print("* ");
            }

            System.out.println();
            
        }

        // Second half
        for(int i = rows ; i >= 1 ; i--) {
            // stars
            for(int j = 1 ; j <= i ; j++) {
                 System.out.print("* ");
            }
    
            // spaces
            for(int j = 1 ; j <= 2*(rows-i) ; j++) {
                System.out.print("  ");
            }
    
            // stars
            for(int j = 1 ; j <= i ; j++) {
                 System.out.print("* ");
            }
    
            System.out.println();
            
        }
    }
}
