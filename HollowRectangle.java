import java.util.Scanner;
class HollowRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		System.out.print("Enter number of column : ");
		int col = sc.nextInt();

		for (int i=1; i<=row ; i++ )
		{
			for (int j=1 ; j<=col ; j++ )
			{
				if (i == 1 || j == 1 || i == row || j == col)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/*
Hollow Rectangle

* * * * *
*       *
*       *
*       *
* * * * *

*/