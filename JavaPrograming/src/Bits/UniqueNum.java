package Bits;

public class UniqueNum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,3,1,4,5};
        System.out.println(unique(arr));
    }
    private  static int unique(int []arr){
        int uni = 0;
        for(int num : arr){
            uni ^= num;
        }
        return uni;
    }
}
