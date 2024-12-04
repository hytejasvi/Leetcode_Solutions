class Solution {
    public int longestConsecutive(int[] nums) {
        // Add all numbers to a HashSet for quick lookup
        HashSet<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }
        int maxLength = 0;
        for (int num : nums) {
            // Only start counting when `num` is the beginning of a sequence
            if (!mySet.contains(num - 1)) { // Check if `num` is the start of a sequence
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the sequence
                while (mySet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the maximum length
                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
}