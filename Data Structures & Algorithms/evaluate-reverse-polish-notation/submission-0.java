class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            if(tokens[i].matches("-?\\d+")){
                st.push(Integer.parseInt(tokens[i]));
            }else if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }else if(tokens[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }else{
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
        }
        return st.pop();
    }
}
