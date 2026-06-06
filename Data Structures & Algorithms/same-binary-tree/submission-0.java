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
    static boolean ans; 
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ans = true;
        dfs(p,q);
        return ans;
    }
    public void dfs(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return;
        }
        else if((p!=null&&q==null)||(p==null&&q!=null)){
            ans = false;
            return;
        }
        else if(p.val!=q.val){
            ans = false;
            return;
        }
        dfs(p.left,q.left);
        dfs(p.right,q.right);
        return;
    }
}
