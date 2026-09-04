class Solution {

    public String encode(List<String> strs) {
        String response = "";
        for(int i =0;i<strs.size();i++){
            response +="#"+strs.get(i).length()+"#"+strs.get(i);
        }
        return response;
    }

    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();
        int index = 0;
        while(index<str.length()){
            String word = "";

            if(str.charAt(index)=='#'){
                index++;
            }

            int num =0;
            while(index<str.length()&&str.charAt(index)!='#'){
                num = num*10+(str.charAt(index)-'0');
                index++;
            }

            index++;

            while(num-->0){
                if(index>=str.length()) break;
                word+=str.charAt(index);
                index++;
            }

            response.add(word);
        }
        return response;
    }
}
