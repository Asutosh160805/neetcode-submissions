class MyHashSet {
    ArrayList<Integer> arr;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!this.contains(key)){
            arr.add(key);
        }
    }
    
    public void remove(int key) {
        arr.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(int i=0;i<arr.size();i++){
            if(key==arr.get(i)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */