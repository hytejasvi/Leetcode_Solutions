// Last updated: 1/16/2026, 8:17:20 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String s2 = s.replaceAll("//s+", "").replaceAll("[^A-Za-z0-9]","").toLowerCase();
4        int left = 0, right = s2.length()-1;
5        while(left < right) {
6            if(s2.charAt(left) != s2.charAt(right)) {
7                return false;
8            }
9            left++;
10            right--;
11        }
12        return true;
13    }
14}