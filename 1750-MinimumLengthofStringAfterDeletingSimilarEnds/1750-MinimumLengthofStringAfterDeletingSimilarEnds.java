class Solution {
    public int minimumLength(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            // Move the left pointer forward as long as characters are the same
            char currentChar = s.charAt(left);
            while (left <= right && s.charAt(left) == currentChar) {
                left++;
            }
            // Move the right pointer backward as long as characters are the same
            while (right >= left && s.charAt(right) == currentChar) {
                right--;
            }
        }
        return right - left + 1;
    }
}