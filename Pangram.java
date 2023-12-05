public class Pangram {
    public static void main(String[] args) {

        boolean flag = false;

        String str = "The quick brown fox jumps over lazy dog";

        str = str.replace(" ","");

        str = str.toLowerCase();

        char[] ch = str.toCharArray();

        int[] arr = new int[26];

        for (int i=0 ; i<ch.length ; i++) {
            arr[ch[i]-97]++;
        }

        for (int i=0 ; i<26 ; i++) {
            if (arr[i] <= 0) {
                System.out.println("It is not an Pangram");
                flag = true;
                break;
            }
        }

        if (flag == false)
            System.out.println("It is an Pangram");
    }
}
