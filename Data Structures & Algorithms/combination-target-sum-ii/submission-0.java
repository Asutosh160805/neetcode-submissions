class Solution {

    static List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        Arrays.sort(nums);

        res = new ArrayList<>();

        comb(nums, target, 0, new ArrayList<>());

        return res;
    }

    public static void comb(int[] nums,
                            int target,
                            int index,
                            ArrayList<Integer> list) {

        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || index == nums.length) {
            return;
        }

        // TAKE current element
        ArrayList<Integer> take = new ArrayList<>(list);
        take.add(nums[index]);

        comb(nums, target - nums[index], index + 1, take);

        // NOT TAKE current element
        int next = index + 1;

        while (next < nums.length &&
               nums[next] == nums[index]) {
            next++;
        }

        comb(nums, target, next, list);
    }
}

