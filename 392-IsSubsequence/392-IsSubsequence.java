// Last updated: 9/23/2025, 8:28:17 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        int n = s.length();
        int m = t.length();
        while(left < n && right < m) {
            if(s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
            } else {
                right++;
            }
        }
        return left == n;
    }
}