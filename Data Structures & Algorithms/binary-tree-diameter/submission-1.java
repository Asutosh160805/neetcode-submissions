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
    static int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        traverse(root);
        return  ans;
    }

    public static int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = traverse(root.left);
        int right = traverse(root.right);
        ans=Math.max(left+right,ans);
        return Math.max(left,right)+1;
    }
}
