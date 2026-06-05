class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;

       
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] > nums[nums.length - 1]) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        int pivot = l;

        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            l = pivot;
            h = nums.length - 1;
        } else {
            l = 0;
            h = pivot - 1;
        }
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}