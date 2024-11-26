class Solution {
    public String reversePrefix(String word, char ch) {
        int left = 0, right=0;
        StringBuilder sb = new StringBuilder(word);
        
        while(right < word.length()) {
            if (word.charAt(right) == ch) {
                while (left < right) {
                    char temp = word.charAt(left);
                    sb.setCharAt(left, word.charAt(right));
                    sb.setCharAt(right, word.charAt(left));
                    left++;
                    right--;
                }
                return sb.toString();
            } else {
                right++;
            }
        }
        return word;
    }
}