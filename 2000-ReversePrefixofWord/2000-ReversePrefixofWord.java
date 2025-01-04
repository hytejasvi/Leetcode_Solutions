class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        for(int i=0;i<c.length;i++) {
            if(c[i] == ch) {
                int left = 0;
                int right = i;
                while (left < right) {
                    char temp = c[left];
                    c[left] = c[right];
                    c[right] = temp;
                    left++;
                    right--;
                }
                break;
            }
        }
        return new String(c);
    }
}