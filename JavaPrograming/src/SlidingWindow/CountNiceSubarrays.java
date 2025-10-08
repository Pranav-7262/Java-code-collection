package SlidingWindow;

public class CountNiceSubarrays {
    public static void main(String[] args) {
      int []arr = {1,1,2,1,1};
        System.out.println(numberOfSubarrays(arr,3));
    }
    public static int numberOfSubarrays(int[] arr, int k) {
        return countKOdds(arr, k) - countKOdds(arr, k - 1);
    }
    private static int countKOdds(int []arr , int k) {
        int start = 0;
        int count = 0 , oddC = 0;
        for(int end=0;end<arr.length;end++) {
            if(arr[end] %2 ==1){
                oddC++;
            }
            while(oddC > k) {
                if(arr[start] %2 ==1){
                    oddC--;
                }
                start++;
            }
            count += end - start + 1;
        }
        return count;
    }
}
