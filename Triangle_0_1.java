import java.util.Scanner;
class Triangle_0_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		for (int i = 1; i<=row ; i++ )
		{
			int number=1;
			if (i%2==0)
			{
				number=0;
			}
			for (int j=1 ; j<=i ; j++ )
			{
				System.out.print(number+" ");
				if (number == 1)
				{
					number = 0;
				}
				else 
					number = 1;
			}
			System.out.println();
		}
	}
}
