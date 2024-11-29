class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                myMap.put(i, myMap.getOrDefault(i, 0) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> m : myMap.entrySet()) {
            System.out.println("key: "+m.getKey()+ " value: "+m.getValue());
        }
        for (Map.Entry<Integer, Integer> m : myMap.entrySet()) {
            if (m.getValue() == nums.length) {
                list.add(m.getKey());
            }
        }
        list.sort((o1,o2)-> o1-o2);
        return list;
    }
}