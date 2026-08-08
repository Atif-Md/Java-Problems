import java.util.Scanner;

public class SortPosNeg {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void partition(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while (l<r) {
            while (arr[l]<0) l++;
            while(arr[r]>=0) r--;

            if (l<r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter mixed +ve and -ve no in array of size "+n+" :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before sorting: ");
        printArray(arr);
        
        System.out.print("Array after sorting: ");
        partition(arr);
        printArray(arr);


        sc.close();

    }
}
