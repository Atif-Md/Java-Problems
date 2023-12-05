import java.util.Scanner;
class StringReverse {

	static String str2 = "";

	static void case1(String str) {
		// String nstr = new String();

		for(int i=str.length() - 1 ; i>=0 ; i--) {
			str2 += str.charAt(i);
		}

		// System.out.println("After Reversing : "+nstr);
	}

	static void case2(String str) {
		String[] sarr = str.split(" ");
		// String str3 = new String();
		for(int i = sarr.length-1 ; i>=0 ; i--) {
			str2 = str2 + sarr[i] + " ";
		}
	}
	static void case3(String str) {
		for(int i = str.length()-1 ; i>=0 ; i--) {
			str2 = str2 + str.charAt(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		case3(str);
		
		System.out.println(str2);
	}
}