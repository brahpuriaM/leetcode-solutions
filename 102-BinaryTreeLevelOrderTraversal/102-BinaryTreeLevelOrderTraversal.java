// Last updated: 22/09/2025, 12:09:48
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> levels = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();
                if (currNode != null) {
                    levels.add(currNode.val);
                    if (currNode.left != null) {
                        q.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.offer(currNode.right);
                    }
                }
            }
            result.add(levels);
        }
        return result;
    }
}