import java.util.Scanner;

public class MatrixRowReverse {

    static void swap(int[][] arr, int i, int start, int end) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
    }

    static void matrixRowReverse(int[][] arr, int r, int c) {
//        int[][] ans = new int[r][c];
        
        for(int i = 0; i<r ;i++) {
            int start = 0, end = c - 1;
                while (start<end) {
                    swap(arr, i, start, end);
                    start++;
                    end--;
                }
        }
        System.out.println("After Reversing Rows :");
        printMatrix(arr);
    }


    static void printMatrix(int[][] arr) {
        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrix :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter matrix values :");

        for (int i=0 ; i<r1 ; i++) { //rows
            for (int j=0 ; j<c1 ; j++) { //columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        printMatrix(a);


        System.out.println("Row Reverse Matrix :");
        matrixRowReverse(a, r1, c1);

    }
}
