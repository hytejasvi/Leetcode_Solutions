// Last updated: 1/16/2026, 9:50:59 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        /*int red=0;
4        int white=0;
5        int blue=0;
6        for(int n: nums) {
7            if(n==0) {
8                red++;
9            } else if(n==1) {
10                white++;
11            } else{
12                blue++;
13            }
14        }
15        for(int i= 0;i<red;i++) {
16            nums[i] = 0;
17        }
18        for(int i= red;i<=(red+white-1);i++) {
19            nums[i] = 1;
20        }
21        for(int i= red+white;i<=(red+white+blue-1);i++) {
22            nums[i] = 2;
23        } */
24        int left=0, mid=0;
25        int right = nums.length-1;
26        while(mid <= right) {
27            if(nums[mid] == 0) {
28                int temp = nums[mid];
29                nums[mid] = nums[left];
30                nums[left] = temp;
31                left++;
32                mid++;
33            } else if(nums[mid] == 2) {
34                int temp = nums[mid];
35                nums[mid] = nums[right];
36                nums[right] = temp;
37                right--;
38            } else {
39                mid++;
40            }
41        }
42    }
43}