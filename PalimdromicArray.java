import java.util.Scanner;

/**
 * PalimdromicArray
 */
public class PalimdromicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements in the array: ");

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        for(int i=0 ; i<n/2 ; i++ ) {
            if (arr[i] != arr[n-i-1]) {
                flag = 1;
                System.out.println("Entered array is not Palindromic");
                break;
            }
        }

        if (flag==0) {
            System.out.println("Entered array is a Palindromic array");
        }



    }
}