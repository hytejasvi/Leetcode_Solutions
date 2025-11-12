// Last updated: 11/12/2025, 3:01:05 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] sArray = new int[26];
        for(char c: s.toCharArray()) {
            sArray[c - 'a']++;
        }
        for(char c: t.toCharArray()) {
            sArray[c-'a']--;
            if(sArray[c-'a'] < 0) {
                return false;
            }
        }
        for (int i: sArray) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}