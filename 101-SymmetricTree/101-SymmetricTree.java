/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return false;
        }
        TreeNode p = root.left;
        TreeNode q = root.right;
        return checkSymmetry(root.left, root.right);
    }

    private boolean checkSymmetry(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && checkSymmetry(p.left, q.right) && checkSymmetry(p.right, q.left);
    }
}