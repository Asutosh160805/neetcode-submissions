class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int[] ans = new int[m+n];
        int k =0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }else{
                ans[k++]=nums2[j];
                j++;
            }
        }
        if(i==m){
            while(j<n){
                ans[k++]=nums2[j++];
            }
        }
        else if(j==n){
            while(i<m){
                ans[k++]=nums1[i++];
            }
        }
        for(int l =0;l<m+n;l++){
            nums1[l]=ans[l];
        }
    }
}