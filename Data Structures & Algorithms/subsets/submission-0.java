class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        comb(nums,new ArrayList<>(),0);
        return ans;
    }
    public static void comb(int[] nums,ArrayList<Integer> list,int i){
        if(i==nums.length){
            ans.add(list);
            return;
        }
        comb(nums,new ArrayList<>(list),i+1);
        list.add(nums[i]);
        comb(nums,new ArrayList<>(list),i+1);
        return ;
    }
}
