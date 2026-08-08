import java.util.Scanner;

public class ArrayReversal {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" elements in array : ");
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array : ");

        for(int i=0 ; i<n/2 ; i++) {
            //swapping arr[i] with arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        for(int i=0 ; i<n ; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
