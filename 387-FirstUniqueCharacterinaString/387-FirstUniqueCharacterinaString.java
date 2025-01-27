class Solution {
    public int firstUniqChar(String s) {
        int uniqueCharIndex = -1;
        char[] charArray = s.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for(int i=0;i< charArray.length;i++) {
            char c = charArray[i];
            boolean isUniqueChar = true;
            if(c != '0') {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[j] == c) {
                        charArray[j] = '0';
                        isUniqueChar = false;
                    }
                }
                if (isUniqueChar) {
                    uniqueCharIndex = i;
                    return uniqueCharIndex;
                }
            }
        }
        return uniqueCharIndex;
    }
}