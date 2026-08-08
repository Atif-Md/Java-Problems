import java.util.Scanner;

public class PrefixSum_2D {

    public static int[][] computePrefixSum2D(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        
        // Traversed the array column-wise to calculate the column-wise prefix sum
        for (int j = 0; j < columns; j++) {
            for (int i = 1; i < rows; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }

        return matrix;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter the number of rows and columns of the matrix:"
        );
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printArray(matrix);

    }
}
