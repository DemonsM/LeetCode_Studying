import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*
        给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:
        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

        示例 2:
        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

        示例 3:
        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

    /**
     * 滑动窗口解法
     */
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c));
            }
            res = Math.max(res, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabca";
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
