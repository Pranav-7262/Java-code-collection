package Math;

public class CountKthRootInRange {
    public static void main(String[] args) {
        System.out.println(countKthRoots(8,30,2));
    }
    public static int countKthRoots(int l, int r, int k) {
        int left , right;
        if (l == 0) {
            left = 0;
        } else {
            double rootL = Math.pow(l, 1.0 / k);
            left = (int) Math.ceil(rootL - 1e-9);
        }
        double rootR = Math.pow(r, 1.0 / k);
        right = (int) Math.floor(rootR + 1e-9);

        return Math.max(0, right - left + 1);
    }
}
