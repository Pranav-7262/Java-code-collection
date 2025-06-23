package Hashing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
     int [] arr = {4,9,5};
     int [] arr1 = {9,4,6};
        System.out.println(intersection(arr,arr1));
    }
    public static ArrayList<Integer>  intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int num:nums1){
            set.add(num);

        }

        TreeSet<Integer> set2 = new TreeSet<>();
        for (int num:nums2){
            if (set.contains(num)){
                set2.add(num);
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(set2);
        return list;
    }
}
