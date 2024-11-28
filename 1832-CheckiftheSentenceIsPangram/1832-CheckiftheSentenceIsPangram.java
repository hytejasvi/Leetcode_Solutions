class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> mySet = new HashSet<>();
        for (char c: sentence.toCharArray()) {
            mySet.add(c);
        }
        return mySet.size() == 26;
    }
}