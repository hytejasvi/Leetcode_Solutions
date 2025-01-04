import java.util.regex.Pattern;
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        int left = 0, right = s.length()-1;
        while(left < right) {
            if(!pattern.matcher(String.valueOf(s.charAt(left))).matches()) {
                left++;
            } else if(!pattern.matcher(String.valueOf(s.charAt(right))).matches()) {
                right--;
            } else {
                sb.setCharAt(left, s.charAt(right));
                sb.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}