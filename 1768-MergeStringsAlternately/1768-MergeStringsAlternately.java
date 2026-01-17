// Last updated: 1/17/2026, 3:57:38 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        StringBuilder merged = new StringBuilder();
4        int i = 0;
5        int j = 0;
6
7        while(i < word1.length() && j < word2.length()){
8            merged.append(word1.charAt(i++));
9            merged.append(word2.charAt(j++));
10
11        }
12        while(i < word1.length()){
13            merged.append(word1.charAt(i++));
14            }
15        while(j < word2.length()){
16            merged.append(word2.charAt(j++));
17        }
18
19        return merged.toString();
20    }
21}