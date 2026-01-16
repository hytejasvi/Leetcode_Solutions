// Last updated: 1/16/2026, 8:44:27 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length == 1) {
4            return 1;
5        }
6        /*int left = 0;
7        int right = 1;
8        while(right < nums.length) {
9            if(nums[left] == nums[right]) {
10                right ++;
11            } else {
12                nums[++left] = nums[right];
13                right++;
14            }
15        }
16        return left+1;*/
17
18        int left = 0;
19        for(int i=1;i< nums.length;i++) {
20            if(nums[left] != nums[i]) {
21                nums[++left] = nums[i];
22            }
23        }
24        return left+1;
25    }
26}