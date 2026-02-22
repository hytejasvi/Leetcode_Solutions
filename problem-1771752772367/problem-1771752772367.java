// Last updated: 2/22/2026, 10:32:52 AM
1class Solution {
2    public int countSequences(int[] nums, long k) {
3        Map<String, Integer> map = new HashMap<>();
4        return dfs(nums, 0, 1L, 1L, k, map);
5    }
6
7    private int dfs(int[] nums, int i, long num, long den, long k, Map<String, Integer> map) {
8        long gcd = gcd(num, den);
9        num /=gcd;
10        den /= gcd;
11        String key = i +","+num+","+den;
12        if(map.containsKey(key)) return map.get(key);
13
14        if(i == nums.length) {
15            if(num == k*den) return 1;
16            else return 0;
17        }
18        int count = 0;
19        count += dfs(nums, i+1, num *nums[i], den, k, map);
20        count += dfs(nums, i+1, num, den*nums[i], k, map);
21        count += dfs(nums, i+1, num, den, k, map);
22        map.put(key, count);
23        return count;
24    }
25
26    private long gcd(long a, long b) {
27        while(b != 0) {
28            long t = b;
29            b = a%b;
30            a = t;
31        }
32        return a;
33    }
34}