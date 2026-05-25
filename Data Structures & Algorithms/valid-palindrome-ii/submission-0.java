class Solution {
    public boolean validPalindrome(String s) {
        boolean delete = true;
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else if(s.charAt(i)!=s.charAt(j)){
                if(delete){
                    boolean a = checkRest(i+1,j,s);
                    boolean b = checkRest(i,j-1,s);
                    return a|b;
                }
            }
        }
        return true;
    }
    public boolean checkRest(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else if(s.charAt(i)!=s.charAt(j)){
                return false;        
            }
        }
        return true;
    }
}