// Last updated: 2/22/2026, 10:22:32 AM
1class Solution {
2    public String maximumXor(String s, String t) {
3        int zeros = 0, ones = 0;
4        for (int i=0;i < t.length();i++) {
5            if(t.charAt(i) == '1') {
6                ones++;
7            } else {
8                zeros++;
9            }
10        }
11        StringBuilder res = new StringBuilder();
12
13        for(int i=0;i < s.length();i++) {
14            char c = s.charAt(i);
15            if(c == '0' && ones > 0) {
16                res.append('1');
17                ones--;
18            } else if(c == '1' && zeros > 0) {
19                res.append('1');
20                zeros--;
21            } else {
22                res.append('0');
23                if(ones > 0) {
24                    ones--;
25                } else {
26                    zeros--;
27                }
28            }
29        }
30        return res.toString();
31    }
32}