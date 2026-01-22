// Last updated: 1/22/2026, 1:02:20 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> c = new HashSet<>();
4        int left = 0;
5        int res = 0;
6        for(int i=0;i< s.length();i++) {
7            char ch = s.charAt(i);
8            while(c.contains(ch)) {
9                c.remove(s.charAt(left));
10                left++;
11            }
12            c.add(ch);
13            res = Math.max(res, i-left+1);
14        }
15        return res;
16    }
17}