// Last updated: 10/16/2025, 9:40:04 AM
class MyHashSet {

    boolean[] mySet;
    public MyHashSet() {
        mySet = new boolean[1000002];
    }
    
    public void add(int key) {
        mySet[key+1] = true;
    }
    
    public void remove(int key) {
        mySet[key+1] = false;
    }
    
    public boolean contains(int key) {
        return mySet[key+1];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */