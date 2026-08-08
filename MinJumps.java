public class MinJumps {

    public static int minJump(int[] arr, int start, int end) {
        //Base condition
        if (start == end) {
            return 0;
        }

        if (arr[start] == 0) {
            return Integer.MAX_VALUE;
        }

        //Now I can jump, so I will try all my jumping options
        int minJumps = Integer.MAX_VALUE;

        for(int i = start+1 ; i <= start+arr[start] && i <= end ; i++) {    //Evaluating all jumping options
            int jumps = minJump(arr, i, end);

            if (jumps != Integer.MAX_VALUE && jumps+1 < minJumps) {
                minJumps = jumps+1;
            }
        }

        return minJumps;
    }


    public static void main(String[] args) {
        
    }
}
