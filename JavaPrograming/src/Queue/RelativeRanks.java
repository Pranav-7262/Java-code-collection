package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        PriorityQueue<Integer>queue = new PriorityQueue<>((a,b) -> score[b] - score[a]);
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        int i = 1;
        while (!queue.isEmpty()){
            int idx = queue.poll();
            if(i > 3){
                res[idx] = Integer.toString(i);
            }
            else if(i==1){
                res[idx] = "Gold Medal";
            } else if(i==2){
                res[idx] = "Silver Medal";
            }else if(i==3){
                res[idx] = "Bronze Medal";
            }
            i++;
        }
        return res;
        }
    }
