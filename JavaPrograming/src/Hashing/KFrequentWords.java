package Hashing;

import java.util.*;

public class KFrequentWords {
    public static void main(String[] args) {
     String [] words = {"i","love","leetcode","i","love","coding"};
        System.out.println(topKFrequent(words,2));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String c:words){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> minheap = new PriorityQueue<>((a,b) -> {
            if (a.getValue().equals(b.getValue())){
                return b.getKey().compareTo(a.getKey());//alphabetical order;
            }
            return a.getValue()-b.getValue();//smaller frequency 1st
        });
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            minheap.add(entry);
            if (minheap.size()>k){
                minheap.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while (!minheap.isEmpty()){
            list.add(minheap.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}
