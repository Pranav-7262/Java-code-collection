package Hashing;

import java.util.HashMap;

public class LastSeenNumber {
    public static void main(String[] args) {
     int [] arr = {10, 30, 20, 10, 20};
        System.out.println(lastSeenElement(arr));
    }
    public static int lastSeenElement(int a[]) {
        int n =a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(a[i],i);
        }
        int res = 0;
        int max = n;
        for (int i = 0; i < n; i++) {
           int m = map.get(a[i]);
           if(m<max){
               max = m;
               res = a[i];
           }
        }
        return res;
    }
}
