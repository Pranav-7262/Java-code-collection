package Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
            {34,45,7},
            {56,78,90,34},
            {1,23,3,4},
            {32,67}
        };
        int target = 90;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int [][]arr , int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
