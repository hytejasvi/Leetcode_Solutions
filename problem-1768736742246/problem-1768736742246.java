// Last updated: 1/18/2026, 12:45:42 PM
1class MyHashSet {
2
3    boolean[] mySet;
4    public MyHashSet() {
5        mySet = new boolean[1000002];
6    }
7    
8    public void add(int key) {
9        mySet[key+1] = true;
10    }
11    
12    public void remove(int key) {
13        mySet[key+1] = false;
14    }
15    
16    public boolean contains(int key) {
17        return mySet[key+1];
18    }
19}
20
21/**
22 * Your MyHashSet object will be instantiated and called as such:
23 * MyHashSet obj = new MyHashSet();
24 * obj.add(key);
25 * obj.remove(key);
26 * boolean param_3 = obj.contains(key);
27 */