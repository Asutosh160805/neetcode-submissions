class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> substr = new HashSet<>();
        int left = 0;
        int right = 0;
        int ans =0;
        for(;left<s.length();left++){
            while((right<s.length())&&(!substr.contains(s.charAt(right)))){
                substr.add(s.charAt(right));
                ans = Math.max(ans,substr.size());
                right++;
            }
            substr.remove(s.charAt(left));
        }
        return ans;
    }
}
