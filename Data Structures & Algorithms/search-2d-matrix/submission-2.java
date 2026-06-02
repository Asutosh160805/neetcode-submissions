class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int up = 0;
        int down = matrix.length-1;
        int v_middle = (up+down)/2;
        while(up<=down){
            v_middle = (up+down)/2;
            if(matrix[v_middle][0]==target){
                return true;
            }
            else if(matrix[v_middle][0]>target){
                down = v_middle-1;
            }else{
                up = v_middle+1;
            }
        }
        if(down<0){
            return false;
        }
        int left = 0;
        int right = matrix[0].length-1;
        int h_middle = (left+right)/2;
        while(left<=right){
            h_middle = (left+right)/2;
            if(matrix[down][h_middle]==target){
                return true;
            }
            else if(matrix[down][h_middle]>target){
                right = h_middle-1;
            }else{
                left = h_middle+1;
            }
        }

        return false;
    }
}
