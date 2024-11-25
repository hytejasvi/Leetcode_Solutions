class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while (left < right) {
            if (Character.isLetter(str.charAt(left)) && Character.isLetter(str.charAt(right))){
                char temp = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, temp);
                left++;
                right--;
            } else if (!Character.isLetter(str.charAt(left))) {
                left++;
            } else {
                right --;
            }
        }
        return str.toString();
    }
}