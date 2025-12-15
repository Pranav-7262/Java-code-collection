package Bits;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
    public static int binaryGap(int n) {
        int pos = 0;
        int lastPos = -1;
        int maxD = 0;

        while( n > 0) {
            if((n & 1) ==1) {
                if(lastPos != -1) {
                    maxD = Math.max(maxD, pos - lastPos);
                }
                lastPos = pos;
            }
            pos++;
            n = n >> 1;
        }
        return maxD;
    }
}
