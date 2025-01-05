class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('e');
        charSet.add('i');
        charSet.add('o');
        charSet.add('u');
        int maxCount = 0;
        int windowCount = 0;
        int left = 0;
        for(int right=0;right<s.length();right++) {
            if(charSet.contains(s.charAt(right))) {
                windowCount++;
            }
            while(right-left+1 > k) {
                if(charSet.contains(s.charAt(left))) {
                    windowCount--;
                }
                left++;
            }
            maxCount = Math.max(maxCount, windowCount);
        }
        return maxCount;
    }
}