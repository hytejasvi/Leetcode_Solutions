// Last updated: 11/15/2025, 9:40:30 PM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> myStack = new Stack<>();
        for(String str: logs) {
            if(str.equals("./")) {
                continue;
            } else if(str.equals("../")) {
                if(myStack.size() > 0) {
                    myStack.pop();
                }
            } else {
                myStack.push(str);
            }
        }
        return myStack.size();
    }
}