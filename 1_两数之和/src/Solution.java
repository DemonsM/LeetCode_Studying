import java.util.Arrays;

public class Solution {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int b = nums[j];
                if ((a + b) == target && i != j) {
                    res = new int[]{i, j};
                }
                //break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

}
