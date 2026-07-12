class Solution {
    public int appendCharacters(String s, String t) {
        int p = 0;
        int q = 0;
        if(s.length()==0){
            return t.length();
        }
        while(p<s.length()){
            if(s.charAt(p)==t.charAt(q)){
                q++;
            }
            if(t.length()==q){
                return 0;
            }
            p++;
        }
        int ans = t.length()-q;
        return ans;
    }
}
