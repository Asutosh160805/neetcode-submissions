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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        ans = false;
        dfs(root,subRoot);
        return ans;
    }
    public void dfs(TreeNode root,TreeNode subroot){
        if(root==null){
            return;
        }
        if(root.val == subroot.val){
            ans = ans||compare(root,subroot);
        }
        dfs(root.left,subroot);
        dfs(root.right,subroot);
    }
    public boolean compare(TreeNode root,TreeNode subroot){
        if(root==null&&subroot==null){
            return true;
        }
        else if((root==null&&subroot!=null)||(root!=null&&subroot==null)){
            return false;
        }else if(root.val!=subroot.val){
            return false;
        }
        return compare(root.left,subroot.left)&&compare(root.right,subroot.right);
    }
}
