import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal number : ");
		int decimal_num=sc.nextInt();
		int bin = decimal_num;
		int ans=0;
		int pw=1;
		while(bin>0) {
			int unit_digit=bin%2;
			ans += (unit_digit*pw);
			bin /= 2;
			pw *= 10;
		}
		System.out.println("Binary number of "+decimal_num+" is: "+ans);

	}
}

