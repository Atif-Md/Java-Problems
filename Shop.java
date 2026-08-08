import java.util.Scanner;

public class Shop {
	void meth1(int n) {
		int m;
		int k = n*100;
		if(k>=1000) {
			m = (k/100)*10;
			int res = k-m;
			System.out.println(res);
		}
		else {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		new Shop().meth1(20);
	}
}