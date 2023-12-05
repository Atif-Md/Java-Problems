import java.util.Scanner;
class HalfPyramidWithNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int row = sc.nextInt();
		for (int i = 1; i<=row ; i++ )
		{
			for (int j = 1 ; j<=i ; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
