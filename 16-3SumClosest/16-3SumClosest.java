// Last updated: 1/20/2026, 11:29:43 AM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int res = 0;
4        int maxDiff = Integer.MAX_VALUE;
5        int n = nums.length;
6        Arrays.sort(nums);
7        for(int i=0;i <n;i++) {
8            
9            int left = i+1;
10            int right= n-1;
11            while(left < right) {
12                int sum = nums[i]+nums[left]+nums[right];
13                int currentDiff = Math.abs(sum - target);
14                if(sum == target) {
15                    return sum;
16                } else if(sum > target) {
17                    if(currentDiff < maxDiff) {
18                        maxDiff = currentDiff;
19                        res = sum;
20                    }
21                    right--;
22                } else {
23                    if(currentDiff < maxDiff) {
24                        maxDiff = currentDiff;
25                        res = sum;
26                    }
27                    left++;
28                }
29            }
30        }
31        return res;
32    }
33}