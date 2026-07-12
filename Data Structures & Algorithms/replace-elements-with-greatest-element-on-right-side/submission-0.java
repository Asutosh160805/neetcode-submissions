class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = st.peek();
            if(temp>st.peek()){
                st.pop();
                st.push(temp);
            }
        }
        return arr;
    }
}