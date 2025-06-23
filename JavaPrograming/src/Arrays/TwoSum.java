package Arrays;
public class TwoSum {
    public static void main(String[] args) {
                int[] nums = {1, 2, 3, 4, 5};
                int target = 9;

                // Call the twoSum method and print the result
                int[] result = twoSum(nums, target);
                if (result != null) {
                    System.out.println(result[0] + " " + result[1]);
                } else {
                    System.out.println("No solution");
                }
            }

            public static int[] twoSum(int[] nums, int target) {
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }
                return null;
            }
        }
