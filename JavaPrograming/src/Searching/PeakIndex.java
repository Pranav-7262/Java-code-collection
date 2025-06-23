package Searching;

public class PeakIndex {
    public static void main(String[] args) {
        int []arr= {0,10,5,2};
        System.out.println(peakindex(arr));
    }
    public static int peakindex(int []arr){
        int s= 0;
        int l= arr.length-1;
        while (s<l){
            int m = s+(l-s)/2;
            if (arr[m]>arr[m+1]){
                l = m;
            }
            else {
                s = m+1;
            }
        }
        return s;
    }
}
