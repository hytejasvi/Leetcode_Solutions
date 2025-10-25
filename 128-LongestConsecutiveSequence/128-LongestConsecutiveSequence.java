// Last updated: 10/25/2025, 9:43:33 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
        for(int i: nums) {
            mySet.add(i);
        } //O(n) TC
        int max = 0;

    for (int num : mySet) {  // iterate over unique elements
        if (!mySet.contains(num - 1)) {  // sequence start
            int currentNum = num;
            int count = 1;

            while (mySet.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }
            max = Math.max(max, count);
        }
    }
    return max;
    }
}