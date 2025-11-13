// Last updated: 11/13/2025, 9:25:41 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int left = 0, right = 0;
        int minChange = Integer.MAX_VALUE;
        while(right < blocks.length()) {
            char c = blocks.charAt(right);
            if(c=='W') {
                count++;
            }
            while((right - left+1) > k) {
                if(blocks.charAt(left) == 'W') {
                    count--;
                }
                left++;
            }
            if((right - left+1) == k) {
                minChange = Math.min(count, minChange);
            }
            right++;
        }
        return minChange;
    }
}