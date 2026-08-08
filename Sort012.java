/*  Given array contains only 0,1 and 2. Sort them in ascending order
*
* */

public class Sort012 {

    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid <= high) {
            if (arr[mid]==0) {
                swap(arr,low,mid);
                low++;
                mid++;
            }else if (arr[mid]==1){
                mid++;
            } else if (arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {2,2,0,0,1,1,2,0,1,0};
        sort012(num);
        display(num);
    }

}
