// Last updated: 3/1/2026, 3:20:40 PM
1class Solution {
2    public int minCost(int n) {
3        int[] res = new int[n+1];
4        res[1] = 0;
5        for(int i=2;i<=n;i++) {
6            int min = Integer.MAX_VALUE;
7            for(int a=1;a < i;a++) {
8                int b = i-a;
9                int cost = a*b+res[a]+res[b];
10                if(cost < min) {
11                    min = cost;
12                }
13                res[i] = min;
14            }
15        }
16        return res[n];
17    }
18}