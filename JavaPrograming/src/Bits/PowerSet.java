package Bits;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
    int []arr = {1,2,3};
        System.out.println(countSubsets(arr));
    }
    private static List<List<Integer>> countSubsets(int []arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        int subsets = 1 << n;  // 2 ^ n
        for (int i = 0; i < subsets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0){
                        list.add(arr[j]);
                    }
            }
            ans.add(list);
        }
        return ans;

    }

}
