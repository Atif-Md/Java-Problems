import java.util.Scanner;

public class ReverseArray {


    public static void printArr(int[] arr) {
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void reverseArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArr(arr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" array elements: ");

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArr(arr);

        printArr(arr);

    }
}
