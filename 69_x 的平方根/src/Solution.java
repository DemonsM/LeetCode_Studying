//实现 int sqrt(int x) 函数。 
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
// 输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        long i = 0L;
        while (i * i <= x) {
            i++;
        }
        return (int) (i - 1);
    }

    public int mySqrt2(int x) {
        long left = 0L;
        long right = x / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid; // 该值为 mid ^ 2，如果 mid 使用 int，在 x=2147395599 时, 则 mid * mid 会先越界，再被转型成 long
            long nextSqr = (mid + 1) * (mid + 1); // 该值为（mid + 1）^ 2，

            if (sqr == x || (sqr < x && nextSqr > x)) {
                return (int) mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
