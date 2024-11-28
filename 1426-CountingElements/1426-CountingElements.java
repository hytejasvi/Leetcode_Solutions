class Solution {
    public int countElements(int[] arr) {
        int elementCount = 0;
        /*Map<Integer, Integer> myMap = new HashMap<>();
        for (int j : arr) {
            myMap.put(j, myMap.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : myMap.entrySet()) {
            if (myMap.containsKey(m.getKey()+1)) {
                elementCount += m.getValue();
            }
        }*/

        Set<Integer> mySet = new HashSet<>();
        for (int i: arr){
            mySet.add(i);
        }

        for (int i: arr) {
            if (mySet.contains(i+1)) {
                elementCount++;
            }
        }
        return elementCount;
    }
}