class Solution {
    public int firstUniqChar(String s) {
        int uniqueCharIndex = -1;
        int[] frequencyCount = new int[26];
        for(char c: s.toCharArray()) {
            frequencyCount[c-'a']++;
        }
        for(int i=0;i< s.length();i++) {
            if(frequencyCount[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return uniqueCharIndex;
    }
}