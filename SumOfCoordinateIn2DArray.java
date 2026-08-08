import java.util.*;
class SumOfCoordinateIn2DArray {
    
    static int findSumMatrix(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0;
        for(int i = r1 ; i <= r2 ; i++) {
            for(int j = c1 ; j <= c2 ; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    static void printArr(int[][] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[][] arr = new int[rows][columns];
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter r1 coordinate: ");
        int r1 = sc.nextInt();
        System.out.println("Enter r2 coordinate: ");
        int r2 = sc.nextInt();
        System.out.println("Enter c1 coordinate: ");
        int c1 = sc.nextInt();
        System.out.println("Enter c2 coordinate: ");
        int c2 = sc.nextInt();
        System.out.println(findSumMatrix(arr, r1, r2, c1, c2));
    }
}