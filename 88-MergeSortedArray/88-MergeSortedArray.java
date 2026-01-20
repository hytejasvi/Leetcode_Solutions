// Last updated: 1/20/2026, 5:16:52 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        if(n==0) {
4            return;
5        }
6        if(m==0) {
7            int i=0;
8            for(int x: nums2) {
9                nums1[i] = x;
10                i++;
11            }
12        }
13        int k = nums1.length -1;
14        int left = m-1;
15        int right = n-1;
16        while(left >= 0 && right >= 0) {
17            if(nums1[left] > nums2[right]){
18                nums1[k] = nums1[left];
19                left--;
20            } else {
21                nums1[k] = nums2[right];
22                right--;
23            }
24            k--;
25        }
26        while(right >=0) {
27            nums1[k--] = nums2[right--];
28        }
29    }
30}