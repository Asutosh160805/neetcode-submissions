class Solution {

    public String encode(List<String> strs) {
        StringBuilder msg = new StringBuilder();
        for(int i =0;i<strs.size();i++){
            msg.append(strs.get(i).length()+"#"+strs.get(i));
        }
        String msgs = msg.toString();
        return msgs;
    }

    public List<String> decode(String str) {
        List<String> a = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            a.add(str.substring(j+1,length+j+1));
            i = j + 1 + length;
        }
        return a;
    }
}
