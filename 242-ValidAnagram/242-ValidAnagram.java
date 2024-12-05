class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<t.length();i++) {
            myMap.put(t.charAt(i), myMap.getOrDefault(t.charAt(i), 0)-1);
            if (myMap.get(t.charAt(i)) <=0) {
                myMap.remove(t.charAt(i));
            }
        }
        return myMap.size() == 0;
    }
}