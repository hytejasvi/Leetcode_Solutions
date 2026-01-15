// Last updated: 1/15/2026, 9:34:14 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs.length == 1) return strs[0];
4        if (strs[0].length() == 0) return "";
5        
6        int prefixLen = strs[0].length();
7        
8        for (int i = 1; i < strs.length; i++) {
9            prefixLen = Math.min(prefixLen, strs[i].length());
10            
11            int j = 0;
12            while (j < prefixLen && strs[0].charAt(j) == strs[i].charAt(j)) {
13                j++;
14            }
15            
16            prefixLen = j;
17            if (prefixLen == 0) return "";
18        }
19        
20        return strs[0].substring(0, prefixLen);
21    }
22}