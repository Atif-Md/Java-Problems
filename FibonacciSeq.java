import java.util.*;
class FibonacciSeq 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=sc.nextInt();
		ArrayList al=new ArrayList();
		int a=0,b=1;
		al.add(a);
		al.add(b);
		for (int i=0;i<n-2;i++)
		{
			int c=a+b;
			al.add(c);
			a=b;
			b=c;
		}
		System.out.println(al);

	}
}
