class Solution {
    public String reverseWords(String s) {
        String[] s2 = s.trim().split(" ");
        int left = 0, right = s2.length-1;
        while(left < right) {
            String temp = s2[left];
            s2[left] = s2[right];
            s2[right] = temp;
            left++;
            right--;
        }
        StringBuilder res = new StringBuilder();
        for (String s1 : s2) {
            if(!s1.isEmpty()) {
                res.append(" ").append(s1);
            }
        }
        return res.toString().trim();
    }
}