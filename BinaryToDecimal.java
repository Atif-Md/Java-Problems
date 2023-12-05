import java.util.Scanner;
class BinaryToDecimal
{
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

	}
}

