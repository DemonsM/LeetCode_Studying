//根据一棵树的前序遍历与中序遍历构造二叉树。
//
// 注意:
//你可以假设树中没有重复的元素。
//
// 例如，给出
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
//
// 返回如下的二叉树：
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// Related Topics 树 深度优先搜索 数组
// 👍 976 👎 0


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
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preOrder, int preStart, int preEnd,
                           int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        //前序遍历第一个元素即为二叉树根节点
        int root = preOrder[preStart];

        //寻找root在中序遍历中的位置
        int index = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (root == inOrder[i]) {
                index = i;
                break;
            }
        }

        int leftSize = index - inStart;

        TreeNode result = new TreeNode(root);
        //递归
        result.left = build(preOrder, preStart + 1, preStart + leftSize,
                inOrder, inStart, index - 1);
        result.right = build(preOrder, preStart + leftSize + 1, preEnd,
                inOrder, index + 1, inEnd);

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
