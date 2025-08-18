package InvertBinaryTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        
        TreeNode tempLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempLeft);

        return root;
    }
}
