package Hashing;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HM {
    public static void main(String[] args) {
        //Country(key)  population(value)
        HashMap<String,Integer>map=new HashMap<>(); //creating

        //Insertion
        map.put("India",140);//key val pairs
        map.put("China",150);
        map.put("US",30);

        System.out.println(map);//Un-order map printing
        System.out.println(map.getOrDefault("India",0));
        map.put("China",180);
        System.out.println(map);//replace for value(update)

        //Search
        if (map.containsKey("China")){
            System.out.println("Key is in map");//present
        }
        else {
            System.out.println("Key is not in map");
        }

        System.out.println(map.get("China"));//Already key exists returns value
        System.out.println(map.get("Japan"));//key doesn't exist
        System.out.println(map.get("US"));


        //Iteration (normal)
        int arr[] ={1,2,3,4};
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int val:arr){ //HM iteration
            System.out.print(val +" ");
        }
        System.out.println();

        //for (int key:arr)
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());//key
            System.out.println(e.getValue());//val
        }
        Set<String>keys=map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove entry
        map.remove("China");
        System.out.println(map);

         int ans= map.get("India");
        System.out.println(ans);

        System.out.println(map);
        System.out.println(map.remove("India"));
        System.out.println(map.size());

        if (map.containsKey("US")){
            System.out.println("key is in the map");
        }
        else{
            System.out.println("The key isn't in the map....!!!!");
        }
    }
}
