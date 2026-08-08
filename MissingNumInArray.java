import java.util.Scanner;

public class MissingNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" elements in array : ");
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        int sum_natural_nums = ((n+1)*(n+2))/2;

        int sum = 0;

        for(int i=0 ; i<n ; i++) {
            sum += arr[i];
        }

        int missing_num = sum_natural_nums - sum;

        System.out.println("Missing number in array is : "+missing_num);

    }
}
