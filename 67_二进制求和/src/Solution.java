//给定两个二进制字符串，返回他们的和（用二进制表示）。 
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串

class Solution {
    public String addBinary(String a, String b) {
        /*char[] x = a.toCharArray();
        char[] y = b.toCharArray();*/
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
            i--;
            j--;
        }
        if (carry==1){
            res.append(1);
        }
        return res.reverse().toString();
    }
}

