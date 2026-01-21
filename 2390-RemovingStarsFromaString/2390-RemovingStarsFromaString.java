// Last updated: 1/21/2026, 9:05:36 AM
1class Solution {
2    public String removeStars(String s) {
3        StringBuilder res = new StringBuilder();
4        for(char c: s.toCharArray()) {
5            if(c == '*') {
6                if(res.length() > 0) {
7                    res.deleteCharAt(res.length()-1);
8                }
9            } else {
10                res.append(c);
11            }
12        }
13        return res.toString();
14    }
15}