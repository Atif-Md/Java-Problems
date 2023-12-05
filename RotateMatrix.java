import java.util.Scanner;

public class RotateMatrix {

    static void matrixRowReverse(int[][] matrix, int r, int c) {
        for (int i=0 ; i<r ; i++) {
            int start=0, end = c-1;
            while (start<end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }



    static void transposeMatrixInPlace(int[][] matrix, int r, int c) {
        for (int i=0 ; i<r ; i++) {
            for (int j=i ; j<c ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    static void rotate(int[][] matrix,int n) {
        //Transpose
        //Reverse each row of transpose matrix
        transposeMatrixInPlace(matrix, n, n);

        matrixRowReverse(matrix,n,n);

        System.out.println("After Rotation :");
        printMatrix(matrix);
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
        System.out.println("Enter number of rows and columns for matrix(Square Matrix) :");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter "+r*c+" elements :");

        for (int i=0 ; i<r ; i++) { //rows
            for (int j=0 ; j<c ; j++) { //columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix :");
        printMatrix(a);

        System.out.println("Matrix After Rotating 90 degree :");
        rotate(a, r);

    }
}
