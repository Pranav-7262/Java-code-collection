package Recursion;

import java.util.ArrayList;

public class ListFoundIndex {
    public static void main(String[] args) {
        int []arr = {2,4,5,6,7,8,6,8};
   ArrayList<Integer> list = findAllIndex(arr,0,8,new ArrayList<>());
        System.out.println(list);
    }
    static ArrayList<Integer> findAllIndex(int []arr,int index,int target,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,index+1,target,list);
    }
}
