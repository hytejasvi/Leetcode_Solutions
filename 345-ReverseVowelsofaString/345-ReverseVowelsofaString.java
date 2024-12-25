class Solution {
    public String reverseVowels(String s) {
        char[] input = s.toCharArray();
        int left = 0, right=input.length-1;
        while(left<right) {
            char c = input[left];
            if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' |
                    c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U') {
                char d = input[right];
                if (d == 'a' | d == 'e' | d == 'i' | d == 'o' | d == 'u' |
                        d == 'A' | d == 'E' | d == 'I' | d == 'O' | d == 'U') {
                    input[left] = d;
                    input[right] = c;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return new String(input);
    }
}