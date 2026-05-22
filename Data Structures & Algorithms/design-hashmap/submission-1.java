class MyHashMap {
    ArrayList<Integer> keyList;
    ArrayList<Integer> valueList;
    public MyHashMap() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keyList.indexOf(key)==-1){
            keyList.add(key);
            valueList.add(value);
        }else{
            valueList.set(keyList.indexOf(key),value);
        }
    }
    
    public int get(int key) {
        if(keyList.indexOf(key)==-1){
            return -1;
        }
        return valueList.get(keyList.indexOf(key));
    }
    
    public void remove(int key) {
        int index = keyList.indexOf(key);
        if(index != -1){
            keyList.remove(index);
            valueList.remove(index);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */