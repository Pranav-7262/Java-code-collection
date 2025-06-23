package Recursion;

public class SearchLinear {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,9,44,90};
        int target = 44;
//        System.out.println(isfound(arr,0,target));
//        System.out.println(isfoundindex(arr,0,target));
        System.out.println(isfoundindexlast(arr, arr.length-1, target));
    }
    static boolean isfound(int []arr,int index,int target){
        if (index==arr.length){
            return false;
        }
        return arr[index] == target || isfound(arr,index+1, target);
    }
    static int isfoundindex(int []arr, int index, int target){
        if (index==arr.length){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else {
            return isfoundindex(arr, index + 1, target);
        }
    }
    static int isfoundindexlast(int []arr, int index, int target){
        if (index==-1){
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        else {
            return isfoundindexlast(arr, index - 1, target);
        }
    }
}
