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
    static List<Integer> arr;
    public int kthSmallest(TreeNode root, int k) {
        arr = new ArrayList<>();
        inOrder(root,k);
        return arr.get(k-1);
    }
    public static void inOrder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inOrder(root.left,k);
        arr.add(root.val);
        inOrder(root.right,k);
    }
}
