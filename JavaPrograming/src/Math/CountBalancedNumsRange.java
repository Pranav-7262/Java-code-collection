package Math;

public class CountBalancedNumsRange {
    public static void main(String[] args) {
    long  low = 120, high = 129;
        System.out.println(countBalanced(low,high));
    }
    public static long countBalanced(long low, long high) {
        long count=0;
        for(long i=low;i<=high;i++) {
            if (i < 10) continue;
            long sumOdd = 0, sumEven = 0;
            String s = Long.toString(i);
            for(int j=0;j<s.length();j++) {
                int digit = s.charAt(j) - '0';
                if((j+1 & 1) ==1) {
                    sumOdd += digit;
                }else {
                    sumEven += digit;
                }
            }
            if(sumOdd == sumEven) {
                count++;
            }

        }
        return count;
    }
}
