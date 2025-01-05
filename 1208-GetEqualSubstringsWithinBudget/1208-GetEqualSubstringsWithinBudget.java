class Solution {
    /*public int equalSubstring(String s, String t, int maxCost) {
        int res = 0;
        int left = 0;
        int[] diff = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            diff[i] = Math.abs(t.charAt(i) - s.charAt(i));
        }
        int windowSum=0;
        for(int right=0;right<s.length();right++) {
            windowSum = windowSum + diff[right];
            while(windowSum > maxCost) {
                windowSum = windowSum-diff[left];
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }*/

    public int equalSubstring(String s, String t, int maxCost) {
    int res = 0;
    int left = 0;
    int windowSum = 0;
    for (int right = 0; right < s.length(); right++) {
        windowSum += Math.abs(s.charAt(right) - t.charAt(right));
        while (windowSum > maxCost) {
            windowSum -= Math.abs(s.charAt(left) - t.charAt(left));
            left++;
        }
        res = Math.max(res, right - left + 1);
    }
    return res;
    }
}