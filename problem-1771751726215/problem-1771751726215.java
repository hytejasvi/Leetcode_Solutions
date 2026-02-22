// Last updated: 2/22/2026, 10:15:26 AM
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        int[] factorial = new int[10];
4        factorial[0] = 1;
5        for(int i=1;i <=9;i++) {
6            factorial[i] = factorial[i-1] * i;
7        }
8        char[]dig = Integer.toString(n).toCharArray();
9        Arrays.sort(dig);
10        return backtrack(new boolean[dig.length], new StringBuilder(), dig, factorial);
11    }
12
13    private boolean backtrack(boolean[] used, StringBuilder way, char[] dig, int[] factorial) {
14        if(way.length() == dig.length) {
15            if(way.charAt(0) == '0') {
16                return false;
17            }
18            int num = Integer.parseInt(way.toString());
19            int sum = 0;
20            for(int i=0;i< way.length();i++) {
21                sum = sum + factorial[way.charAt(i) - '0'];
22            }
23            if(sum == num) return true;
24            return false;
25        }
26        for(int i=0;i < dig.length;i++) {
27            if(used[i]) continue;
28            if(i > 0 && dig[i] == dig[i-1] && !used[i-1]) continue;
29
30            used[i] = true;
31            way.append(dig[i]);
32            if(backtrack(used, way, dig, factorial)) return true;
33            way.deleteCharAt(way.length()-1);
34            used[i] = false;
35        }
36        return false;
37    }
38}