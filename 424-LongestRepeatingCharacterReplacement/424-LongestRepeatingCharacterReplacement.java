// Last updated: 10/5/2025, 9:49:49 PM
class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> myMap = new HashMap<>();
        int left = 0, res = 0;
        int maxChar = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
            maxChar = Math.max(maxChar, myMap.get(ch));
            while ((i - left + 1) - maxChar > k) {
                myMap.put(s.charAt(left), myMap.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}