// Last updated: 1/15/2026, 8:19:47 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       /* if(s.length() != t.length()) {
4            return false;
5        }
6        int[] sArray = new int[26];
7        for(char c: s.toCharArray()) {
8            sArray[c - 'a']++;
9        }
10        for(char c: t.toCharArray()) {
11            sArray[c-'a']--;
12            if(sArray[c-'a'] < 0) {
13                return false;
14            }
15        }
16        for (int i: sArray) {
17            if(i != 0) {
18                return false;
19            }
20        }
21        return true;*/
22        //best approach:
23        if(s.length() != t.length()) return false;
24    
25    int[] count = new int[26];
26    
27    for(int i = 0; i < s.length(); i++) {
28        count[s.charAt(i) - 'a']++;
29        count[t.charAt(i) - 'a']--;
30    }
31    
32    for(int i : count) {
33        if(i != 0) return false;
34    }
35    
36    return true;
37    }
38}