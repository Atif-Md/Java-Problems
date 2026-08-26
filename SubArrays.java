import java.util.Scanner;

public class SubArrays {


    public static void subArrays(int[] arr) {
        int ts=0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i ; j < arr.length ; j++) {
                for(int k = i ; k <= j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of sub arrays: "+ts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements for array: ");

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        subArrays(arr);

    }
}
