package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(550));
    }
    public static String intToRoman(int num) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer,String>entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                sb.append(entry.getValue());
                num -= entry.getKey();

            }
        }
        return sb.toString();
    }
}
