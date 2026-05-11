package Arrays;

public class SmallestBalancedIndex {
    public static void main(String[] args) {
 int []arr = {813,974,946,966,915,924,812,1000,891,875,989,656,991,806,818,999,971,276,923,997,992,943,983,811,909,990,924,991,726,818,969,690,996,784,992,949,915,931,932,821,699,688,712,805,849,489,406,482,777,974,479,237,963,903,957,995,814,864,832,889,936,467,831,970,757,646,962,987,885,924,918,710,763,839,860,888,971,994,339,253,564,759,68,747,797,716,939,987,68,953,1000,298,10,1,1,1,1,1,48,1,77,2};
        System.out.println(smallestBalancedIndex(arr));
    }
    public static int smallestBalancedIndex(int[] nums) {

        int n = nums.length;

        long sum = 0;
        for(int num : nums) sum += num;
        long [] sp = new long[n + 1];
        sp[n] = 1;

        for (int i = n-1; i >= 0; i--) {
            if(nums[i]!= 0 && sp[i + 1] > sum / nums[i]) {
                sp[i] = sum + 1;
            }else {
                sp[i] = sp[i+1] * nums[i];
            }
        }
        long leftSum=0;
        for(int i=0;i<n;i++) {
            if(leftSum == sp[i+1]) return i;
            leftSum += nums[i];

        }
        return -1;
    }
}
