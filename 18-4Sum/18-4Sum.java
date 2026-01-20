// Last updated: 1/20/2026, 10:25:48 PM
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
12                    //here checking j > i+1 so we only check for duplicates if j has moved any positions in teh current iteration.
13                    continue;
14                }
15                int left = j+1, right = nums.length-1;
16                while( left < right) {
17                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
18                    if(sum > target) {
19                        right--;
20                    } else if(sum < target) {
21                        left++;
22                    } else {
23                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
24                        while(left < right && nums[left] == nums[left+1]) {
25                            left++;
26                        }
27                        while(left < right && nums[right] == nums[right-1]) {
28                            right--;
29                        }
30                        left++;
31                        right--;
32                    }
33                }
34            }
35        }
36        return res;
37    }
38}