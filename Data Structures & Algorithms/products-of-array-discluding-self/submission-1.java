class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        boolean haszero = false;
        int countzero = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                haszero = true;
                countzero++;
                continue;
            }
            product = product*nums[i];
        }

        for(int i=0;i<ans.length;i++){
            if(!haszero && nums[i]!=0){
                ans[i] = product/nums[i];
            }else if(countzero>1){
                return ans;
            }else if(haszero && nums[i]==0){
                ans[i] = product;
            }else if(haszero && nums[i]!=0){
                ans[i] = 0;
            }
        }
        return ans;
    }
}  
