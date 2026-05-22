class Solution {
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int feq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==res){
                feq++;
            }
            else if(nums[i]!=res && feq!=0){
                feq--;
            }
            else if(nums[i]!=res && feq==0){
                res = nums[i];
            }
        }
        return res;
    }
}