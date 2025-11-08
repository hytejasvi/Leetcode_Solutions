// Last updated: 11/8/2025, 1:13:08 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words) {
            /*int left = 0, right = s.length()-1;
            if(s.charAt(left) != s.charAt(right)) {
                continue;
            }
            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    continue;
                } else {
                    left++;
                    right--;
                }
            }
            if(left >= right) {
                return s;
            }*/

            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            if(s.contentEquals(sb)) {
                return s;
            }
        }
        return "";
    }
}