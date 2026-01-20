// Last updated: 1/20/2026, 5:57:33 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i< nums.length-2;i++) {
6            if(i >0 && nums[i] == nums[i-1]) {
7                continue;
8            }
9            int left = i+1, right = nums.length-1;
10            while(left < right) {
11                int sum = nums[i]+nums[left]+nums[right];
12                if(sum > 0) {
13                    right--;
14                } else if(sum < 0) {
15                    left++;
16                } else {
17                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
18                    while(left < right && nums[left] == nums[left+1]) {
19                        left++;
20                    }
21                    while(left < right && nums[right] == nums[right-1]) {
22                        right--;
23                    }
24                    left++;
25                    right--;
26                }
27            }
28        }
29        return res;
30    }
31}