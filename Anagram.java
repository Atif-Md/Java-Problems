import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // Anagram: It is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word "listen" is an anagram of "silent".

        String str1 = "School master";
        String str2 = "The classroom";
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char []ar1 = str1.toCharArray();
        char []ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        // What does equals() function do in java?
        // equals() function in Array class 

        if(Arrays.equals(ar1,ar2))
            System.out.println("It is an Anagram");
        else
            System.out.println("It is not an Anagram");
    }
}
