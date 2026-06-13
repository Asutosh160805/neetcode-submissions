class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        comb(nums,target,0,new ArrayList<>());
        return res;
    }
    public static void comb(int[] nums,int target,int index,ArrayList<Integer> list){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index==nums.length){
            return;
        }
        comb(nums,target,index+1,new ArrayList<>(list));
        list.add(nums[index]);
        comb(nums,target-nums[index],index,new ArrayList<>(list));
        return;
    }
}
