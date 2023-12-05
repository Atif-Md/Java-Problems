import java.util.Scanner;

class Demo {
	static int SumOfDigitCheck(int n){
		if(n==0)
			return 0;
		else 
			return (n%10)+SumOfDigitCheck(n/10);
	}
}

class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();

		System.out.println(Demo.SumOfDigitCheck(n));
	}
}