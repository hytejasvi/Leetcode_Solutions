class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int[] n : nums) {
            for(int m: n) {
                myMap.put(m, myMap.getOrDefault(m, 0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            if(entry.getValue() == nums.length) {
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
}