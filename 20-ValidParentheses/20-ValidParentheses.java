// Last updated: 11/13/2025, 5:33:29 PM
class Solution {
    public boolean isValid(String s) {
        if(s.length() <2) {
            return false;
        }
        Stack<Character> myStack = new Stack<>();
        
        for(int i=0;i <s.length();i++) {
            char currentBracket = s.charAt(i);
            if(currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                myStack.push(currentBracket);
            } else {
                if(myStack.isEmpty()) {
                    return false;
                }
                char removingBracket = myStack.pop();
                if((currentBracket == ')' && removingBracket == '(') || (currentBracket == '}' && removingBracket == '{')
                || (currentBracket == ']' && removingBracket == '[')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}