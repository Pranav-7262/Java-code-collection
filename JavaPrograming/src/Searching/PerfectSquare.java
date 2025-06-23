package Searching;

public class PerfectSquare {
    public static void main(String[] args) {
        int num =808201;
        System.out.println(isPerfectSquare(num));
    }


        public static boolean isPerfectSquare(int num) {
            if (num < 2) {
                return true; // 0 and 1 are perfect squares
            }

            int left = 2;
            int right = num / 2;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                // Use long to avoid overflow when squaring mid
                long midSquared = (long) mid * mid;

                if (midSquared == num) {
                    return true; // found a perfect square
                } else if (midSquared > num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return false;
        }
    }



