import java.util.Scanner;

//When 2 elements are swapped in sorted array
public class SortArray {

    static void sortArr(int[] arr) {
        int x=-1,y=-1;

        if (arr.length<=1) {    //Edge case
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                if (x==-1) {    //1st conflict
                    x=i-1;
                    y=i;
                } else {    //2nd conflict
                    y=i;
                }   
            }
        }

        //swap x,y index value
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Element:");

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements before sorting are :");
        printArray(arr);
        
        sortArr(arr);
        System.out.print("Array elements after sorting are :");
        printArray(arr);


        sc.close();
    }
}
