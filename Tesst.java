import java.util.Scanner;

class Tesst {
    public static void main(String[] args) {

        // char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        // int index = 0;

        char ch = 'A';

        for(int i = 0 ; i < 4 ; i++) {
            for(int j = 0 ; j <= i ; j++)
                System.out.print(ch++);
            System.out.println();
        }

    }
}