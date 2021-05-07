import org.junit.Test;

import java.util.Arrays;

public class Solution {
    /**
     * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
     * <p>
     * 你可以返回满足此条件的任何数组作为答案。
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     *  
     * <p>
     * 提示：
     * <p>
     * 1. 1 <= A.length <= 5000
     * 2. 0 <= A[i] <= 5000
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            while (A[i] % 2 == 0 && i < j)
                i++;
            while (A[j] % 2 == 1 && i < j)
                j--;
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }

    @Test
    public void test() {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
