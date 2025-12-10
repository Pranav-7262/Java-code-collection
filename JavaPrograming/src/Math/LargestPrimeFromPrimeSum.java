package Math;

public class LargestPrimeFromPrimeSum {
    public static void main(String[] args) {
        System.out.println(largestPrime(20));
    }
    public static int largestPrime(int n) {

        int sum = 0 , ans = 0;
        for(int i=2;i<=n;i++) {
            if(isPrime(i)) {
                sum += i;
                if (sum > n) break;
                if(isPrime(sum)) ans = sum;
            }
        }
        return ans;
    }
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
