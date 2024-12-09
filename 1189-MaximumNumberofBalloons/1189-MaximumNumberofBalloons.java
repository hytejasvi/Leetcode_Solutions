class Solution {
    public int maxNumberOfBalloons(String s) {
        String target = "balloon";
         int[] charCountS = new int[26]; // Count frequencies of characters in `s`
        int[] charCountTarget = new int[26]; // Count frequencies of characters in `target`

        // Populate character counts for `s`
        for (char c : s.toCharArray()) {
            charCountS[c - 'a']++;
        }

        // Populate character counts for `target`
        for (char c : target.toCharArray()) {
            charCountTarget[c - 'a']++;
        }

        // Calculate the maximum number of copies of `target` that can be formed
        int res = Integer.MAX_VALUE;
        for (char c : target.toCharArray()) {
            res = Math.min(res, charCountS[c - 'a'] / charCountTarget[c - 'a']);
        }

        return res;
    }
}