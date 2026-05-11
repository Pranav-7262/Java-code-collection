package Math;

import java.util.*;

public class NumsWithSumTwoCubes {
    public static void main(String[] args) {
        System.out.println(findGoodIntegers(4104));
    }
    public static List<Integer> findGoodIntegers(int n) {
        Map<Integer , List<int[]> > map = new HashMap<>();
        int cube = (int) Math.cbrt(n);

        for(int i=1;i<=cube;i++) {
            for(int j=i;j<=cube;j++) {
                int sum = i*i*i + j*j*j;
                if(sum > n) break;
                map.putIfAbsent(sum , new ArrayList<>());
                map.get(sum).add(new int[]{i,j});
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key).size() >= 2) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
