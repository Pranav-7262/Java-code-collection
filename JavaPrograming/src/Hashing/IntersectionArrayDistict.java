package Hashing;

import java.util.HashSet;

public class IntersectionArrayDistict {
    public static void main(String[] args) {
   int []arr = {89, 24, 75, 11, 23};
   int []arr2 = {89, 2, 4};
        System.out.println(numberofElementsInIntersection(arr,arr2));
    }
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashSet<Integer>hs = new HashSet<>();
        for (int num:a){
            hs.add(num);
        }
        HashSet<Integer>hs2 = new HashSet<>();
        for (int num:b){
            if (hs.contains(num)){
                hs2.add(num);
            }
        }
        return hs2.size();
    }
}
