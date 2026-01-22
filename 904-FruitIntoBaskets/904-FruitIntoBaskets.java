// Last updated: 1/22/2026, 12:28:30 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        Map<Integer, Integer> mm = new HashMap<>();
4        int left = 0;
5        int res = 0;
6        for (int i=0;i < fruits.length;i++){
7            mm.put(fruits[i], mm.getOrDefault(fruits[i], 0)+1);
8            
9            while(mm.size() > 2) {
10                mm.put(fruits[left], mm.get(fruits[left]) - 1);
11                if (mm.get(fruits[left]) == 0) {
12                    mm.remove(fruits[left]);
13                }
14                left++;
15            }
16            res = Math.max(res, i - left+1);
17        }
18        return res;
19    }
20}