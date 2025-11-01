// Last updated: 11/1/2025, 6:24:30 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        int res = -1;
        while(start <= end) {
            int mid = (end + start)/2;
            if(letters[mid] > target) {
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res == -1 ? letters[0] : letters[res];
    }
}