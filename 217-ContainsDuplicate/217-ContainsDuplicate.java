// Last updated: 1/18/2026, 10:55:08 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        /*Arrays.sort(nums);
4        for(int i=0;i < nums.length-1;i++) {
5            if(nums[i] == nums[i+1]) {
6                return true;
7            }
8        }
9        return false;*/
10        Set<Integer> mySet = new HashSet<>();
11        for(int num: nums) {
12            if(mySet.contains(num)) {
13                return true;
14            } else {
15                mySet.add(num);
16            }
17        }
18        return false;
19    }
20}