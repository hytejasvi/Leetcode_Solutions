// Last updated: 10/5/2025, 1:13:14 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (seen.containsKey(c)) {
                start = Math.max(seen.get(c) + 1, start);
            }

            seen.put(c, end);
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}