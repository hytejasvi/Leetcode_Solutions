// Last updated: 3/1/2026, 3:15:34 PM
1class Solution {
2    public String trimTrailingVowels(String s) {
3       int i = s.length() -1;
4        while( i >= 0&& isVowel(s.charAt(i))) {
5            i--;
6        }
7        return s.substring(0, i+1);
8    }
9    private boolean isVowel(char c) {
10        return c=='a' || c=='e' || c=='i' || c=='o' || c == 'u';
11    }
12}