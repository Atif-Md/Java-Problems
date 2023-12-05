import java.util.Scanner;
class InvertedHalfPyramidPattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row =sc.nextInt();
		for (int i =1; i<=row ; i++ )
		{
			for (int j = row ; j > i ; j-- )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
