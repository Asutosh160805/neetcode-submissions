class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int[] info = binarySearch(arr, x);

        int left = info[0];
        int right = info[1];

        List<Integer> ans = new ArrayList<>();

        // if x exists in array, add it first
        if (info[2] != -1) {
            ans.add(arr[info[2]]);
        }

        while (ans.size() < k) {

            if (left < 0) {
                ans.add(arr[right++]);
            }
            else if (right >= arr.length) {
                ans.add(arr[left--]);
            }
            else if (Math.abs(x - arr[left]) <= Math.abs(x - arr[right])) {
                ans.add(arr[left--]);
            }
            else {
                ans.add(arr[right++]);
            }
        }

        Collections.sort(ans);
        return ans;
    }

    public int[] binarySearch(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (arr[middle] > x) {
                right = middle - 1;
            }
            else if (arr[middle] < x) {
                left = middle + 1;
            }
            else {
                return new int[]{middle - 1, middle + 1, middle};
            }
        }

        // x not found
        return new int[]{right, left, -1};
    }
}