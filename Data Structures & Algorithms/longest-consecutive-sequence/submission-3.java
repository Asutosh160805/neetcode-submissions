class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int sq = 1;
        int max = 1;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i-1]+1==nums[i]){
                sq++;
            }
            else{
                sq=1;
            }
            max = Math.max(sq,max);
        }
        return max;
    }
}
