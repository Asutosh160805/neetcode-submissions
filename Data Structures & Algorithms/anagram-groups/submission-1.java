class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<List<Integer>, List<String>> hm = new HashMap<>();

        for (String word : strs) {

            int[] c = new int[26];

            for (int j = 0; j < word.length(); j++) {
                c[word.charAt(j) - 'a']++;
            }

            // Convert int[] -> List<Integer>
            List<Integer> key = new ArrayList<>();

            for (int count : c) {
                key.add(count);
            }

            if (hm.containsKey(key)) {
                hm.get(key).add(word);
            } else {
                hm.put(key, new ArrayList<>());
                hm.get(key).add(word);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<List<Integer>, List<String>> entry : hm.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}