// Last updated: 1/17/2026, 10:04:55 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int[] res = new int[2];
4        int left = 0, right = numbers.length-1;
5        while (left < right) {
6            int num = numbers[left] + numbers[right];
7            if(num == target) {
8                res[0] = left+1;
9                res[1] = right+1;
10                return res;
11            } else if(num > target) {
12                right --;
13            } else {
14                left ++;
15            }
16        }
17        return res;
18    }
19    //TC: O(n) -> we get the result in a single pass
20    //SC: O(1) -> we only use certain variables and no additional space
21}