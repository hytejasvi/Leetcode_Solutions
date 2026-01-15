// Last updated: 1/15/2026, 8:37:03 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] res = new int[2];
4        //brute force approach
5        //TC: O(n2), SC: O(1)
6        /*for(int i=0;i< nums.length;i++) {
7            for(int j=i+1;j< nums.length;j++) {
8                if(nums[i] + nums[j] == target) {
9                    res[0] = i;
10                    res[1] = j;
11                    break;
12                }
13            }
14        }
15        return res; */
16        //approach2: using additional space
17        //TC: O(n), SC: O(n)
18        Map<Integer,Integer> myMap = new HashMap<>();
19        for(int i=0;i<nums.length;i++) {
20            if(myMap.containsKey(target-nums[i])) {
21                res[0] = myMap.get(target-nums[i]);
22                res[1] = i;
23                break;
24            } else {
25                myMap.put(nums[i], i);
26            }
27        }
28        return res;
29    }
30}