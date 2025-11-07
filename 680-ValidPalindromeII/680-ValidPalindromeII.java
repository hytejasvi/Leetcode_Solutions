// Last updated: 11/7/2025, 9:50:17 PM
class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <= 2) {
            return true;
        } 
        int left = 0, right = s.length()-1;
        int skipped = 0;
        boolean res = false;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                if(skipLeftElement(s, left+1, right)) {
                    return true;
                } else if(skipRightElement(s, left, right-1)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean skipLeftElement(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean skipRightElement(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}