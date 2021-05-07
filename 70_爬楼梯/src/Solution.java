import org.junit.Test;

public class Solution {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * <p>
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * <p>
     * 注意：给定 n 是一个正整数。
     * <p>
     * 示例 1：
     * <p>
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     * <p>
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/climbing-stairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int climbStairs(int n) {
        return fib2(n);
    }

    public int fib(int n) {
        int sum = 0;
        if (n == 1 || n == 2) {
            sum = n;
        }
        if (n > 2) {
            sum = fib(n - 1) + fib(n - 2);
        }
        return sum;
    }

    public int fib2(int n) {
        int[] sum = new int[n + 1];
        sum[0] = 1;
        sum[1] = 1;
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        return sum[n];
    }

    @Test
    public void test() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "  " + climbStairs(i));
        }
    }
}
