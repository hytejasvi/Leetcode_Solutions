// Last updated: 1/18/2026, 12:00:10 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> res = new HashMap<>();
4        for(String str: strs) {
5            char[] ch = str.toCharArray();
6            Arrays.sort(ch);
7            String s = new String(ch);
8            res.putIfAbsent(s, new ArrayList<>());
9            res.get(s).add(str);
10        }
11        return new ArrayList<>(res.values());
12    }
13}