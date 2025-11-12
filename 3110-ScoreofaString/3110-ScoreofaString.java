// Last updated: 11/12/2025, 2:43:20 PM
class Solution {
    public int scoreOfString(String s) {
        if(s.length() <3) {
            return Math.abs(s.charAt(1) - s.charAt(0));
        }
        int score = 0;
        for(int i=1;i < s.length();i++) {
            score = score + Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return score;
    }
}