import java.util.Scanner;
class SwappingNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter value of b : ");
		int b = sc.nextInt();

		//Swap.logic1(a,b);
		//Swap.logic2(a,b);
		//Swap.logic3(a,b);
		//Swap.logic4(a,b);
		Swap.logic5(a,b);
	}
}
class Swap
{
	/*static void logic1(int a, int b)
	{
		System.out.println("Before swapping a="+a+" and b="+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a+" and b="+b);
	}*/

	/*static void logic2(int a, int b)
	{
		System.out.println("Before swapping a="+a+" and b="+b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+" and b="+b);
	}*/

	/*static void logic3(int a, int b)
	{
		System.out.println("Before swapping a="+a+" and b="+b);
		a = a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping a="+a+" and b="+b);
	}*/

	/*static void logic4(int a, int b)
	{
		System.out.println("Before swapping a="+a+" and b="+b);
		a = a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a="+a+" and b="+b);
	}*/

	static void logic5(int a, int b)
	{
		System.out.println("Before swapping a="+a+" and b="+b);
		a=a+b-(b=a);
		System.out.println("After swapping a="+a+" and b="+b);
	}
}