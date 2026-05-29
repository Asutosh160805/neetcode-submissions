class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set =new HashSet<>();
        int j = 0;
        for(int i =0;i<nums.length;i++){
            while(set.size()!=k+1&&j<nums.length){
                if(set.contains(nums[j])){
                    return true;
                }
                set.add(nums[j]);
                j++;
            }
            set.remove(nums[i]);
        } 
        return false;
    }
}