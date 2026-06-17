class Solution {
    public static List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        res = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            list.add(i);
        }
        comb(list,0,k,new ArrayList<Integer>());
        return res;
    }
    public static void comb(List<Integer> list,int i,int k,List<Integer> subPart){
        if(subPart.size()==k){
            res.add(new ArrayList<Integer>(subPart));
            return;
        }
        if(i>=list.size()){
            return;
        }
        comb(list,i+1,k,new ArrayList<Integer>(subPart));
        subPart.add(list.get(i));
        comb(list,i+1,k,new ArrayList<Integer>(subPart));
    }
}