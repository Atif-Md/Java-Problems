import java.util.Scanner;

public class MatrixMultiplication {

    static void swap(int[][] arr, int i, int start, int end) {
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
    }

   


    static void matrixMultiplication(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Invalid Dimensions - Multiplication not Possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i=0 ; i<r1 ; i++) {    //rows
            for (int j=0; j<c2 ; j++) {     //column
                for (int k=0 ; k<c1 ; k++) {
                    /*
                        mul[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0] + a[0][2]*b[2][0] + ..........
                        mul[i][j] = ith row of a * jth column of b
                    */

                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrix 1 and Matrix 2 :");
        printMatrix(mul);

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
        System.out.println("Enter number of rows and columns for matrix 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter matrix values :");

        for (int i=0 ; i<r1 ; i++) { //rows
            for (int j=0 ; j<c1 ; j++) { //columns
                a[i][j] = sc.nextInt();
            }
        }

       System.out.println("Enter number of rows and columns for matrix 2 :");
       int r2 = sc.nextInt();
       int c2 = sc.nextInt();

       int[][] b = new int[r2][c2];

       System.out.println("Enter matrix values :");

       for (int i=0 ; i<r2 ; i++) { //rows
           for (int j=0 ; j<c2 ; j++) { //columns
               b[i][j] = sc.nextInt();
           }
       }

        System.out.println("Matrix 1 :");
        printMatrix(a);

//        System.out.println("Matrix 2 :");
//        printMatrix(b);

       matrixMultiplication(a, b, r1, c1, r2,c2);

        // matrixRowReverse(a, r1, c1);

    }
}
