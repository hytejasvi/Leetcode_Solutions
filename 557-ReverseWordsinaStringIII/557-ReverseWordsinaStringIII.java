class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] s1 = s.split("\s");
        for (String s2 : s1) {
            int right = s2.length() - 1;
            while (right >= 0) {
                str.append(s2.charAt(right));
                right--;
            }
            str.append(" ");
        }
        return str.toString().trim();
    }
}