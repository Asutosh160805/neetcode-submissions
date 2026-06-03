class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = 0;
        for(int i=0;i<weights.length;i++){
            high = high+weights[i];
        }
        while(low<=high){
            int middle = (low+high)/2;
            int j = 0;
            int count_days = 0;
            while(j<weights.length){
                if(middle<weights[j]){
                    count_days++;
                    middle = (low+high)/2;
                }
                middle = middle - weights[j];
                j++;
            }
            middle = (low+high)/2;
            if(count_days>=days){
                low = middle+1;
            }
            else{
                high = middle-1;
            }
        }
        return low;
    }
}