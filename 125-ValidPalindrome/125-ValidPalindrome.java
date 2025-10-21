// Last updated: 10/21/2025, 3:28:59 PM
class Solution {
    public boolean isPalindrome(String s) {
        String input = s.replaceAll("//s+","").toLowerCase();
        input = input.replaceAll("[^a-z0-9]","");

        StringBuilder builder = new StringBuilder(input);
        String reverse = builder.reverse().toString();
        

        if(input.equals(reverse)){
            return true;
        }
        
        System.out.println(builder.reverse());
        System.out.println(input);
        return false;
    }
}