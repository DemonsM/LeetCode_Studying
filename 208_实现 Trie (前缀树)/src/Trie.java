//Trie2（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼
//写检查。
//
// 请你实现 Trie2 类：
//
//
// Trie2() 初始化前缀树对象。
// void insert(String word) 向前缀树中插入字符串 word 。
// boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false
// 。
// boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否
//则，返回 false 。
//
//
//
//
// 示例：
//
//
//输入
//["Trie2", "insert", "search", "search", "startsWith", "insert", "search"]
//[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
//输出
//[null, null, true, false, true, null, true]
//
//解释
//Trie2 trie = new Trie2();
//trie.insert("apple");
//trie.search("apple");   // 返回 True
//trie.search("app");     // 返回 False
//trie.startsWith("app"); // 返回 True
//trie.insert("app");
//trie.search("app");     // 返回 True
//
//
//
//
// 提示：
//
//
// 1 <= word.length, prefix.length <= 2000
// word 和 prefix 仅由小写英文字母组成
// insert、search 和 startsWith 调用次数 总计 不超过 3 * 104 次
//
// Related Topics 设计 字典树
// 👍 639 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
public class Trie {
    /**
     * Map实现
     */
    private final Map<Character, Map> map;
    private Map<Character, Map> t;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        map = new HashMap<>();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        t = map;
        for (char c : word.toCharArray()) {
            if (!t.containsKey(c)) {
                t.put(c, new HashMap<Character, Map>());
            }
            t = t.get(c);
        }
        t.put('#', null);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        t = map;
        for (char c : word.toCharArray()) {
            if (!t.containsKey(c)) {
                return false;
            }
            t = t.get(c);
        }
        return t.containsKey('#');
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        t = map;
        for (char c : prefix.toCharArray()) {
            if (!t.containsKey(c)) {
                return false;
            }
            t = t.get(c);
        }
        return true;
    }
}

/**
 * Your Trie2 object will be instantiated and called as such:
 * Trie2 obj = new Trie2();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)
