class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int ite = 1;
        while(ite<nums.length){
            if(nums[ite]!=nums[ite-1]){
                nums[left++]=nums[ite];
            }
            ite++;
        }
        return left;
    }
}