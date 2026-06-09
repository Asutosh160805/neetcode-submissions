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
    public int goodNodes(TreeNode root) {
        ans = 0;
        int maxVal=Integer.MIN_VALUE;
        traverse(root,maxVal);
        return ans;
    }

    public static void traverse(TreeNode root,int maxValue){
        if(root==null){
            return;
        }
        if(root.val>=maxValue){
            maxValue = root.val;
            ans++;
        }
        traverse(root.left,maxValue);
        traverse(root.right,maxValue);
    }
}
