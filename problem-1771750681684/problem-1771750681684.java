// Last updated: 2/22/2026, 9:58:01 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int player1 = 0, player2= 0;
4        boolean isfirstActive = true;
5        for(int i=0; i< nums.length;i++) {
6            if(nums[i]%2 == 1) {
7                isfirstActive = !isfirstActive;
8            }
9            if((i+1) %6 == 0) {
10                isfirstActive = !isfirstActive;
11            }
12            if(isfirstActive) {
13                player1 = player1 + nums[i];
14            } else {
15                player2 = player2 + nums[i];
16            }
17        }
18        return player1 - player2;
19    }
20}