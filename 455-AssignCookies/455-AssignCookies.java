// Last updated: 11/8/2025, 12:50:45 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0, right = 0;
        while(left < g.length && right < s.length) {
            if(g[left] <= s[right]) {
                res++;
                left++;
            }
            right++;
        }
        return res;
    }
}