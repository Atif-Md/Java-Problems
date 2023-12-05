import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

    //Applicable only for square matrices
    static void transposeMatrixInPlace(int[][] arr, int r, int c) {
        for (int i=0 ; i<c ; i++) {
            for (int j=i ; j<r ;j++) {
                //swap matrix[i][j] , matrix[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printMatrix(arr);
    }

    static int[][] transposeMatrix(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
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
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix values :");

        for (int i=0 ; i<r ; i++) { //rows
            for (int j=0 ; j<c ; j++) { //columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix :");
        printMatrix(a);

        System.out.println("Transpose of Matrix :");
        transposeMatrixInPlace(a, r, c);


//        int[][] ans = transposeMatrix(a,r,c);
//        printMatrix(ans);
    }
}
