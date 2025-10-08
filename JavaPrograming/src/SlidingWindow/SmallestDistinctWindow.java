package SlidingWindow;

import java.util.HashMap;

public class SmallestDistinctWindow {
    public static void main(String[] args) {
        String s = "aabcbcdbca";
        System.out.println(findSubString(s));
    }
    public static int findSubString(String str) {
        // code here

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch , 1);
        }
        int distinct = map.size();

        int start = 0;
        int minL = Integer.MAX_VALUE;
        int n = str.length();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int end=0;end<n;end++) {
            char ch = str.charAt(end);
            map2.put(ch,map2.getOrDefault(ch,0)+1);


            while(map2.size() == distinct) {
                minL = Math.min(minL , end-start+1);

                char first = str.charAt(start);
                map2.put(first,map2.getOrDefault(first,0)-1);
                if(map2.get(first) == 0) {
                    map2.remove(first);
                }
                start++;
            }
        }
        return minL;
    }
}
