// Last updated: 11/19/2025, 9:32:20 PM
class Solution {
    public int rearrangeCharacters(String text, String target) {
        String balloon = "balloon";
        if(text.length() < target.length()) {
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
            if(myMap.containsKey(target.charAt(left))) {
                while(left < target.length() && myMap.containsKey(target.charAt(left))) {
                    char ch = target.charAt(left);
                    myMap.put(ch, myMap.get(ch)-1);
                    if(myMap.get(ch) == 0) {
                        myMap.remove(ch);
                    }
                    left++;
                }
                if(left == target.length()) {
                    count++;
                }
            } else {
                break;
            }
        }
        return count;
        /*if(s.length() < target.length()) {
            return 0;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c: target.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        for(char c: s.toCharArray()) {
            if(tMap.containsKey(c)) {
                sMap.put(c, sMap.getOrDefault(c, 0)+1);
            }
        }
        if(sMap.size() < tMap.size()) {
            return 0;
        }
        int count = 0;
        int i=0;
        while(i < tMap.size()) {
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
        return count;*/
    }
}