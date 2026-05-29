class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        HashMap<Character,Integer> hm1 =new HashMap<>();
        int windowSize = s1.length();
        for(int i=0;i<windowSize;i++){
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        }
        int i = 0;
        HashMap<Character,Integer> hm2 =new HashMap<>();
        for(;i<windowSize;i++){
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int j=0;j<s2.length();j++){
            if(hm1.equals(hm2)){
                return true;
            }
            int value = hm2.get(s2.charAt(j));
            if(value==1){
                hm2.remove(s2.charAt(j));
            }else{
                hm2.put(s2.charAt(j),value-1);
            }
            if(i==s2.length())break;
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
            i++;
        }
        if(hm1.equals(hm2)){
                return true;
        }
        return false;
    }
}
