class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        int q = 0;
        if(s.length()==0){
            return true;
        }
        if(s.length()>t.length()){
            return false;
        }
        while(q<t.length()){
            if(t.charAt(q)==s.charAt(p)){
                p++;
            }
            if(p==s.length()){
                return true;
            }
            q++;
        }
        return false;
    }
}