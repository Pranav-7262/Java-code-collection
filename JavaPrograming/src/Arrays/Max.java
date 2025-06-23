package Arrays;

public class Max {
    public static void main(String[] args) {
      int []arr={2,34,5,63,67,9};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(maxrange(arr,1,4));
    }
    static int max(int []arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
       //min value function
        static int min(int []arr) {
            int minval = arr[0];//assume
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minval) {
                    minval = arr[i];
                }
            }
            return minval;
        }
    static int maxrange(int []arr,int start,int end){
        int maxval=arr[start];//assume
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    }


