// Last updated: 10/28/2025, 12:00:34 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Important: empty subarray has sum 0

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists in map
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Update the count of current prefixSum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}