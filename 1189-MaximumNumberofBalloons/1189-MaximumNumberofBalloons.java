// Last updated: 11/19/2025, 9:21:18 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        if(text.length() < balloon.length()) {
            return 0;
        }
        int count=0;
        Map<Character, Integer> myMap = new HashMap<>();
        for(char c: text.toCharArray()) {
            myMap.put(c, myMap.getOrDefault(c, 0)+1);
        }
        int i=0;
        while(i < text.length()) {
            int left = 0;
            if(myMap.containsKey(balloon.charAt(left))) {
                while(left < balloon.length() && myMap.containsKey(balloon.charAt(left))) {
                    char ch = balloon.charAt(left);
                    myMap.put(ch, myMap.get(ch)-1);
                    if(myMap.get(ch) == 0) {
                        myMap.remove(ch);
                    }
                    left++;
                }
                if(left == balloon.length()) {
                    count++;
                }
            } else {
                break;
            }
        }
        return count;
    }
}