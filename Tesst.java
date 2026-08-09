import java.util.Scanner;

class Tesst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of a pencil: ");
        int a = sc.nextInt();
        System.out.println("Enter cost of a pen: ");
        int b = sc.nextInt();
        System.out.println("Enter cost of eraser: ");
        int c = sc.nextInt();

        int total = a + b + c;

        System.out.println("Your total cost is: "+total);
        System.out.println("18% GST amount: "+(total*0.18));

        System.out.println("Total cost after adding GST: "+(total+(total*0.18)));

    }
}