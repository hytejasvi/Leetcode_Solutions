// Last updated: 1/16/2026, 9:07:13 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length < 3) {
4            return nums.length;
5        }
6       /* int left = 0, right = 0;
7        
8        while(right < nums.length) {
9            int count=1;
10            while(right+1 < nums.length && nums[right] == nums[right+1]) {
11                count++;
12                right++;
13            }
14            int swaps = Math.min(count, 2);
15            while(swaps > 0) {
16                nums[left] = nums[right];
17                left++;
18                swaps--;
19            }
20            right++;
21        }
22        return left;*/
23
24        //a more simpler and generic approach for maximum k duplicates:
25        int i = 0;
26        for(int num: nums) {
27            if(i < 2 || nums[i-2] != num) {
28                nums[i] = num;
29                i++;
30            }
31        }
32        return i;
33    }
34}