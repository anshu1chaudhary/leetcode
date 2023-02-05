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
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        inOrder(root);
        System.out.println(res);
        return res;
    }

    public int inOrder(TreeNode root){
        if(root == null){
            return 0;
        }
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
        return 1;
    }
}
    
    