// Last updated: 11/8/2025, 8:56:27 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for(int i=0;i < s.length();i++) {
            if(left < spaces.length && i == spaces[left]) {
                sb.append(" ");
                left++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}