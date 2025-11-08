// Last updated: 11/8/2025, 9:28:33 PM
class Solution {
    public int compress(char[] chars) {
        if(chars.length ==1) {
            return 1;
        }
        int left = 0;
        int index = 0;
        while(left < chars.length) {
            char currentChar = chars[left];
            int count = 0;

            while(left < chars.length && chars[left] == currentChar) {
                count++;
                left++;
            }
            chars[index] = currentChar;
            index++;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index] = c;
                    index++;
                }
            }
        }
        return index;
    }
}