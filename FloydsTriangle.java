import java.util.Scanner;
class FloydsTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		int row = sc.nextInt();
		int k = 1;
		for (int i = 1; i<=row ; i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
	}
}
