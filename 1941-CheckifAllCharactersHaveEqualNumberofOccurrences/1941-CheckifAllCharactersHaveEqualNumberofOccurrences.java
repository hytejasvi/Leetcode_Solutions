class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            myMap.put(c, myMap.getOrDefault(c, 0)+1);
        }
        Set<Integer> charCount = new HashSet<>(myMap.values());
        return charCount.size() == 1;
    }
}