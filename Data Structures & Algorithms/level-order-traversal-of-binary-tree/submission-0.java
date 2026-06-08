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
    static HashMap<Integer,List<Integer>> hm; 
    public List<List<Integer>> levelOrder(TreeNode root) {
        hm = new HashMap<>();
        treeTraversal(root,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry: hm.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void treeTraversal(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(!hm.containsKey(level)){
            hm.put(level,new ArrayList<Integer>());
        }
        hm.get(level).add(root.val);
        treeTraversal(root.left,level+1);
        treeTraversal(root.right,level+1);
    }
}
