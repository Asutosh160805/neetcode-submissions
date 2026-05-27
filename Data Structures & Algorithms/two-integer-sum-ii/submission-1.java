class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j =numbers.length-1;
        int res = 0;
        while(i<j){
            res = numbers[i]+numbers[j];
            if(res>target){
                j--;
            }else if(res<target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{i+1,j+1};
    }
}
