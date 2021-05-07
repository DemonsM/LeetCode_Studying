//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
// 输出: [1,2,4]
// 解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> integers = new ArrayList<>();
        int i = digits.length - 1;
        int carry = 0;
        while (i >= 0) {
            int x = digits[i];
            int sum;
            if (i == digits.length - 1) {
                sum = carry + x + 1;
            } else {
                sum = carry + x;
            }
            carry = sum > 9 ? 1 : 0;
            integers.add(sum % 10);
            i--;
        }
        if (carry == 1) {
            integers.add(1);
        }
        int[] ints = new int[integers.size()];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = integers.get(integers.size() - 1 - j);
        }
        return ints;
    }

    public int[] plusOne2(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
