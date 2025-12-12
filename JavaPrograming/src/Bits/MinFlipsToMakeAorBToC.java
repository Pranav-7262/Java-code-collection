package Bits;

public class MinFlipsToMakeAorBToC {
    public static void main(String[] args) {
      int  a = 2, b = 6, c = 5;
        System.out.println(minFlips(a,b,c));
    }
    public static int minFlips(int a, int b, int c) {
        int count = 0;
        for(int i=0;i<32;i++){
            int ai = (a >> i) & 1;
            int bi = (b >> i) & 1;
            int ci = (c >> i) & 1;
            if (ci == 1) {
                if (ai == 0 && bi == 0) {
                    count += 1;
                }
            }else {
                count += ai + bi;
            }
        }
        return count;
    }
}
