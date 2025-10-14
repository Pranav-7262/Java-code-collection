package TwoDArray;

public class MinSum {
    public static void main(String[] args) {
        int [][] arr= {{1,3} , {4,2}};
        System.out.println(min_sum(arr));
    }
    public static int min_sum(int [][] nums){
        int mini = Integer.MAX_VALUE;
        for(int []arr : nums) {
            int s = arr[0];
            int e = arr[1];
            int sum = s+e;
            mini = Math.min(mini,sum);
        }
        return mini;
    }
}
