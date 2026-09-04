class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        List<Integer>[] arr = new List[nums.length+1];
        
        for(int i=0;i<=nums.length;i++){
            arr[i] = new ArrayList<>();
        }
        
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            arr[entry.getValue()].add(entry.getKey());
        }
        
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[k];

        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].size();j++){
                st.push(arr[i].get(j));
            }
        }

        int index = 0;

        while(index<k){
            ans[index++] = st.pop();
        }

        return ans;
    }
}
