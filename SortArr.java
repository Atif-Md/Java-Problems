
/*Problem Statement :- Given an array where all its elements are sorted in increasing order
*   except two swapped elements, sort it in linear time. Assume there are no duplicates in
*   the array.
*   Input :- A[] = {3,8,6,7,5,9,10 }
*   Output :- B[] = {3,5,6,7,8,9,10 }
* */


public class SortArr {

    static void printArr(int[] arr) {
        for (int i = 0 ; i< arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void sortArr(int[] arr) {
        int n = arr.length;

        int x=-1,y=-1;

        if (n<=1) {     //corner case
            return;
        }

        //process all adjacent element
        for (int i = 1 ; i < n ; i++) {
            if (arr[i-1]>arr[i]) {
                if (x == -1) {  //first conflict
                    x=i-1;
                    y=i;
                }
                else {          //second conflict
                    y=i;
                }
            }
        }

        //swap x and y in arr
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        int num[] = {10};
        sortArr(num);
        printArr(num);
    }

}
