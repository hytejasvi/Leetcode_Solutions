// Last updated: 11/17/2025, 8:23:16 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ops = new Stack<>();
        for(String s: operations) {
            if(s.equals("D")) {
                int x = ops.peek();
                ops.push(x*2);
            } else if(s.equals("C")) {
                ops.pop();
            } else if(s.equals("+")) {
                int first = ops.pop();
                int second = ops.pop();
                int newSum = first+second;
                ops.push(second);
                ops.push(first);
                ops.push(newSum);
            } else {
                ops.push(Integer.valueOf(s));
            }
        }
        if(ops.size() == 0) {
            return 0;
        }
        int i=ops.size();
        int sum = 0;
        while(i > 0) {
            sum = sum+ ops.pop();
            i--;
        }
        return sum;
    }
}