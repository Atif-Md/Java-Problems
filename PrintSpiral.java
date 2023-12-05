import java.util.Scanner;

public class PrintSpiral {

    static void printMatrix(int[][] matrix) {
        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int[][] matrix, int r, int c) {
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements = 0;

        while (totalElements < r*c) {
            //topRow -> leftcol to rightcol
            for (int j = leftCol ; j <= rightCol && totalElements < r*c ; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol -> topRow-1 to bottomRow
            for (int i = topRow ; i <= bottomRow && totalElements < r*c ; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //bottomRow -> rightCol-1 to leftCol
            for (int j=rightCol ; j>=leftCol && totalElements < r*c ; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow-1 to topRow+1
            for (int i=bottomRow ; i>=topRow && totalElements < r*c ; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
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

        System.out.println("Spiral Matrix Traversal :");
        printSpiralMatrix(a, r, c);
    }
}
