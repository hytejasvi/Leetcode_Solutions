// Last updated: 1/12/2026, 9:22:09 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        if(s.length() <= 2) {
4            return true;
5        } 
6        int left = 0, right = s.length()-1;
7        int skipped = 0;
8        boolean res = false;
9        while(left < right) {
10            if(s.charAt(left) != s.charAt(right)) {
11                if(skipLeftElement(s, left+1, right)) {
12                    return true;
13                } else if(skipRightElement(s, left, right-1)) {
14                    return true;
15                } else {
16                    return false;
17                }
18            } else {
19                left++;
20                right--;
21            }
22        }
23        return true;
24    }
25    public boolean skipLeftElement(String s, int left, int right) {
26        while(left < right) {
27            if(s.charAt(left) != s.charAt(right)) {
28                return false;
29            } else {
30                left++;
31                right--;
32            }
33        }
34        return true;
35    }
36    public boolean skipRightElement(String s, int left, int right) {
37        while(left < right) {
38            if(s.charAt(left) != s.charAt(right)) {
39                return false;
40            } else {
41                left++;
42                right--;
43            }
44        }
45        return true;
46    }
47}