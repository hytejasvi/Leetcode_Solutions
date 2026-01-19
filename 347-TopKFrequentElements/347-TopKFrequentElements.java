// Last updated: 1/19/2026, 12:57:52 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> myMap = new HashMap<>();
4        for(int num: nums) {
5            myMap.put(num, myMap.getOrDefault(num, 0)+1);
6        }
7        List<int[]> arr = new ArrayList<>();
8        for(Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
9            arr.add(new int[] {entry.getValue(), entry.getKey()});
10        }
11        arr.sort((a,b) -> b[0]-a[0]);
12        int [] res = new int[k];
13        for(int i=0;i<k;i++) {
14            res[i] = arr.get(i)[1];
15        }
16        return res;
17    }
18}