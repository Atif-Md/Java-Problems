import java.util.Scanner;
class InvertedHalfPyramidPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int row =sc.nextInt();
		

		//First Approach

		/*
		for (int i=1;i<=row ;i++ )
		{
			for (int j=row;j>=i ;j-- )
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		*/


		//Second Approach

		for (int i=row;i>=1 ;i-- )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}
}
