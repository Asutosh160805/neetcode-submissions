class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int[] ans = new int[]{hm.get(nums[i]),i};
                return ans;
            }
            hm.put(target-nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
