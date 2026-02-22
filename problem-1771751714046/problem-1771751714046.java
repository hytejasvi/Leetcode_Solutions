// Last updated: 2/22/2026, 10:15:14 AM
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
11        /*int sum = 0, temp = n;
12        while(temp > 0) {
13            int d = temp % 10;
14            sum = sum + factorial[d];
15            temp = temp /10;
16        }
17        return sum == n;*/
18    }
19
20    private boolean backtrack(boolean[] used, StringBuilder way, char[] dig, int[] factorial) {
21        if(way.length() == dig.length) {
22            if(way.charAt(0) == '0') {
23                return false;
24            }
25            int num = Integer.parseInt(way.toString());
26            int sum = 0;
27            for(int i=0;i< way.length();i++) {
28                sum = sum + factorial[way.charAt(i) - '0'];
29            }
30            if(sum == num) return true;
31            return false;
32        }
33        for(int i=0;i < dig.length;i++) {
34            if(used[i]) continue;
35            if(i > 0 && dig[i] == dig[i-1] && !used[i-1]) continue;
36
37            used[i] = true;
38            way.append(dig[i]);
39            if(backtrack(used, way, dig, factorial)) return true;
40            way.deleteCharAt(way.length()-1);
41            used[i] = false;
42        }
43        return false;
44    }
45}