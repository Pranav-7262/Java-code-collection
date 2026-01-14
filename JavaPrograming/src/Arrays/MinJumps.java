package Arrays;

public class MinJumps {
    public static void main(String[] args) {
  int []arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
    public static int minJumps(int[] arr) {
        // code here
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        int jump = 0;
        int currEnd = 0 , farIndx = 0;

        for(int i=0;i<arr.length-1;i++) {

            farIndx = Math.max(farIndx , i + arr[i]);
            if(i == currEnd) {

                if(farIndx == currEnd){
                    return -1;
                }

                jump++;
                currEnd = farIndx;
            }
        }
        return jump;
    }
}
