import java.util.regex.Pattern;
class Solution {
    /*public String reverseOnlyLetters(String s) {
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
        return sb.toString(); */
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        System.out.println();
        int left = 0, right = c.length-1;
        while (left < right) {
            if(!isAlphabet(c[left])) {
                left++;
            } else if (!isAlphabet(c[right])) {
                right--;
            } else {
                swapChars(c, left, right);
                left++;
                right--;
            }
        }
        return new String(c);
    }
    private void swapChars(char[] c, int left, int right) {
        char temp = c[left];
        c[left] = c[right];
        c[right] = temp;
    }

    private boolean isAlphabet(char c) {
        return ((c>='a' && c<='z') || (c>='A' && c<='Z'));
    }
}