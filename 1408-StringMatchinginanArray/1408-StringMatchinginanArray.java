class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Iterate through each pair of words
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // Skip if comparing the word with itself
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // No need to check further once it's found
                }
            }
        }
        
        return result;
    }
}