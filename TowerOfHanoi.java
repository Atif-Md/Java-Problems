import java.util.Scanner;

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {


    static int moves(int n, char s, char d, char a) {
        //Base Condition
        if (n == 1 || n == 0) {
            return n;
        }

        int steps1 = moves(n-1, s, a, d);

        int steps2 = 1;     //Move the big coin from S to D

        int steps3 = moves(n-1, a, d, s);

        return steps1 + steps2 + steps3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of coins : ");

        int n = sc.nextInt();
        
        System.out.println("No of steps required to move "+n+" coins from S to D using A are : "+moves(n,'S', 'D', 'A'));

    }
}