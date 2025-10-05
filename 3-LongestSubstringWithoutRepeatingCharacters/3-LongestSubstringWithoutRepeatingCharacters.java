// Last updated: 10/5/2025, 1:12:29 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> c = new HashSet<>();
        int left = 0;
        int res = 0;
        for(int i=0;i< s.length();i++) {
            char ch = s.charAt(i);
            while(c.contains(ch)) {
                c.remove(s.charAt(left));
                left++;
            }
            c.add(ch);
            res = Math.max(res, i-left+1);
        }
        return res;
    }
}