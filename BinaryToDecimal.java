import java.util.Scanner;
class BinaryToDecimal {


	public static int binaryToDecimal(int binaryNum) {
		int temp = binaryNum;
		int decimal = 0;
		int pow = 1;
		while (temp > 0) {
			int last_digit = temp%10;
			decimal += (last_digit * pow);
			temp /= 10;
			pow *= 2;
		}
		return decimal;
	}


	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number : ");
		int binary_num=sc.nextInt();
		int bin = binary_num;
		int ans=0;
		int pw=1;
		while(bin>0) {
			int unit_digit=bin%10;
			ans += (unit_digit*pw);
			bin /= 10;
			pw *= 2;
		}
		System.out.println("Decimal number of "+binary_num+" is: "+ans);

		System.out.println("Decimal value: "+binaryToDecimal(binary_num));

	}
}

