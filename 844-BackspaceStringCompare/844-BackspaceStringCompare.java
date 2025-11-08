// Last updated: 11/8/2025, 8:09:32 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        int i=0;
        for(char c: s.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                s1.append(c);
                i++;
            } else {
                if(i>0) {
                    s1.deleteCharAt(i - 1);
                    i--;
                }
            }
        }
        System.out.println(s1);
        int j=0;
        for(char c: t.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                t1.append(c);
                j++;
            } else {
                if(j >0) {
                    t1.deleteCharAt(j - 1);
                    j--;
                }
            }
        }
        return s1.toString().contentEquals(t1);
    }
}