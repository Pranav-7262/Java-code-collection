package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()<3){
            return set.last();
        }
        set.pollLast();
        set.pollLast();
        return set.last();
    }
}
