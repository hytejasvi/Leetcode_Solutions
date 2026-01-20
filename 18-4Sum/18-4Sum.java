// Last updated: 1/20/2026, 10:24:36 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        Arrays.sort(nums);
4        List<List<Integer>> res = new ArrayList<>();
5        for(int i=0;i < nums.length-3;i++) {
6            if(i > 0 && nums[i] == nums[i-1]) {
7                continue;
8            }
9            for(int j = i+1; j < nums.length-2;j++) {
10
11                if(j > i+1 && nums[j] == nums[j-1]) {
12                    continue;
13                }
14                int left = j+1, right = nums.length-1;
15                while( left < right) {
16                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
17                    if(sum > target) {
18                        right--;
19                    } else if(sum < target) {
20                        left++;
21                    } else {
22                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
23                        while(left < right && nums[left] == nums[left+1]) {
24                            left++;
25                        }
26                        while(left < right && nums[right] == nums[right-1]) {
27                            right--;
28                        }
29                        left++;
30                        right--;
31                    }
32                }
33            }
34        }
35        return res;
36    }
37}