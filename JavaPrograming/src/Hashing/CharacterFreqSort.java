package Hashing;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterFreqSort {
    public static void main(String[] args) {
        String str = "pranav";
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> a.getValue()  - b.getValue());//desc
         for (Map.Entry<Character,Integer> entry:list){
             System.out.println("Character: "+entry.getKey() +" value :"+entry.getValue());
         }
    }
}
