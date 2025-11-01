// Last updated: 11/1/2025, 7:25:55 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> s1 = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++) {
            char c = ransomNote.charAt(i);
            s1.put(c, s1.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<magazine.length();i++) {
            char c = magazine.charAt(i);
            if(s1.containsKey(c)) {
                s1.put(c, s1.get(c)-1);
                if(s1.get(c) == 0) {
                    s1.remove(c);
                }
            }
            
        }
        return s1.size() ==0? true: false;
    }
}