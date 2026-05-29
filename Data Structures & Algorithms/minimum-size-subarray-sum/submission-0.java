class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j =0;
        int sum = 0;
        int windowSize = Integer.MAX_VALUE;
        while(i<nums.length){
            while(target>sum && j<nums.length){
                sum = sum+nums[j];
                j++;
            }
            if(sum<target){
                break;
            }
            while(target<=sum && i<nums.length ){
                if(sum>=target){
                    windowSize = Math.min(windowSize,j-i);
                }
                sum = sum-nums[i];
                i++;
            }
        }
        if(windowSize==Integer.MAX_VALUE){
            return 0;
        }
        return windowSize;
    }
}