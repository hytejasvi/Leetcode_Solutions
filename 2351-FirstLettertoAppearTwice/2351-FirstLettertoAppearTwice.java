class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> mySet = new HashSet<>();
        char res = 0;
        for (char c : s.toCharArray()) {
            if (mySet.contains(c)) {
                return c;
            } else {
                mySet.add(c);
            }
        }
        return res;
    }
}