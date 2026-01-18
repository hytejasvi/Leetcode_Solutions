// Last updated: 1/18/2026, 12:35:15 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        /*Map<Integer, Integer> myMap = new HashMap<>();
4        int n = nums.length/2;        
5        for(int num: nums) {
6            myMap.put(num, myMap.getOrDefault(num, 0)+1);
7            if (myMap.get(num) > n) {
8            return num;
9        }
10        }
11        return n;*/
12
13        // a single pass with no extra memory:
14        int num = 0;
15        int count = 0;
16        int n = nums.length / 2;
17        for(int a: nums) {
18            if(count == 0) {
19                num = a;
20            }
21            //count += num==a ? 1: -1; short way of if-else
22            if(num ==a) {
23                count++;
24            } else {
25                count--;
26            }
27        }
28        return num;
29    }
30}