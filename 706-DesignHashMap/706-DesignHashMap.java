// Last updated: 1/18/2026, 12:51:57 PM
1class MyHashMap {
2
3    int[] myMap;
4    public MyHashMap() {
5        myMap = new int[1000001];
6        Arrays.fill(myMap, -1);
7    }
8    
9    public void put(int key, int value) {
10        myMap[key] = value;
11    }
12
13    public int get(int key) {
14        return myMap[key];
15    }
16
17    public void remove(int key) {
18        myMap[key] = -1;
19    }
20}
21
22/**
23 * Your MyHashMap object will be instantiated and called as such:
24 * MyHashMap obj = new MyHashMap();
25 * obj.put(key,value);
26 * int param_2 = obj.get(key);
27 * obj.remove(key);
28 */