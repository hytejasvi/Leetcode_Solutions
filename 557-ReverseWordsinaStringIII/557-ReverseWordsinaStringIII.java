class Solution {
    /*public String reverseWords(String s) {
        if(s.length() == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length());
        String[] strArray = s.split("\\s+");
        for(String str : strArray) {
            int right = str.length() - 1;
            while(right >=0) {
                sb.append(str.charAt(right));
                right--;
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }*/

//Approach 2, with better performance
/*    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder(s.length());
        for(String word : words) {
            result.append(new StringBuilder(word).reverse().append(" "));
        }
        return result.toString().trim();
    } */

     public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                     .map(word -> new StringBuilder(word).reverse().toString())
                     .collect(Collectors.joining(" "));
     }
}