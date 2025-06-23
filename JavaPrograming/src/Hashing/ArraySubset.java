package Hashing;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
  int []a = {11, 7, 1, 13, 21, 3, 7, 3}; int []b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }
    public static boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<a.length; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int j=0; j<b.length; j++){
            if(!map.containsKey(b[j]) || map.get(b[j]) == 0){
                return false;
            }
            else{
                map.put(b[j],map.get(b[j])-1);
            }
        }
        return true;
    }
}
