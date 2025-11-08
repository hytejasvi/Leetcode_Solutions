// Last updated: 11/8/2025, 7:52:25 PM
class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s2: s1) {
            StringBuilder sb = new StringBuilder(s2);
            res.append(sb.reverse()).append(" ");
        }
        return res.toString().trim();
    }
}