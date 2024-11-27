class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0, windowCount = 0;
        int left = 0;
        for (int i=0;i<k;i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                windowCount++;
            }
        }
        maxCount = Math.max(maxCount, windowCount);
        for (int i=k;i<s.length();i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                windowCount++;
            }
            while ((i-left+1) > k) {
                if ("aeiou".indexOf(s.charAt(left)) != -1) {
                    windowCount--;
                }
                left++;
            }
            maxCount = Math.max(maxCount, windowCount);
        }
        return maxCount;
    }
}