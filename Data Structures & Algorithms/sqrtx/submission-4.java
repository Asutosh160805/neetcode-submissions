class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x-1;
        int middle = 0;
        while(low<=high){
            middle = low+ (high-low)/2;
            long square = (long)middle*middle;
            if(square==x){
                return middle;
            }
            else if(square>x){
                high = middle-1;
            }
            else{
                low = middle+1;
            } 
        }
        if(x==1)
        return 1;
        if(x==0)
        return 0;
        return high;
    }
}