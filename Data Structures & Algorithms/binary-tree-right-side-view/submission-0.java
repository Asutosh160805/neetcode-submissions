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
    static Map<Integer,Integer> hm;
    public List<Integer> rightSideView(TreeNode root) {
        hm = new HashMap<>();
        List<Integer>  ans = new ArrayList<>();
        traverseTree(root,0);
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void traverseTree(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(root!=null&&!hm.containsKey(level)){
            hm.put(level,root.val);
        }
        traverseTree(root.right,level+1);
        traverseTree(root.left,level+1);
        return;
    }
}
