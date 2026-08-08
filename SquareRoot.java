import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its square root:");
        int number = scanner.nextInt();

        int result = squareRoot(number);
        System.out.println("The square root of " + number + " is: " + result);
    }

    public static int squareRoot(int number) {
        int low = 0, high = number, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid < number) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}