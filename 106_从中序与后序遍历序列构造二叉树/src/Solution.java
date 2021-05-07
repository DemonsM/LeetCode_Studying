//根据一棵树的中序遍历与后序遍历构造二叉树。
//
// 注意:
//你可以假设树中没有重复的元素。
//
// 例如，给出
//
// 中序遍历 inorder = [9,3,15,20,7]
//后序遍历 postorder = [9,15,7,20,3]
//
// 返回如下的二叉树：
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// Related Topics 树 深度优先搜索 数组
// 👍 478 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class Solution {
    public static void main(String[] args) {
        int[] inOrder = {9, 3, 15, 20, 7};
        int[] postOrder = {9, 15, 7, 20, 3};

        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(inOrder, postOrder);
        System.out.println(treeNode);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inOrder, int inStart, int inEnd,
                           int[] postOrder, int postStart, int postEnd) {
        if (inStart > inEnd)
            return null;

        int root = postOrder[postEnd];

        int index = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (root == inOrder[i]) {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;

        TreeNode result = new TreeNode(root);

        result.left = build(inOrder, inStart, index - 1,
                postOrder, postStart, postStart + leftSize - 1);
        result.right = build(inOrder, index + 1, inEnd,
                postOrder, postStart + leftSize, postEnd - 1);

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
