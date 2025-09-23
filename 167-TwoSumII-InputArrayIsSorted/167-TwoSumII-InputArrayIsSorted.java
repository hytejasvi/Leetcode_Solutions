// Last updated: 9/23/2025, 3:47:13 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length-1;
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if(num == target) {
                res[0] = left+1;
                res[1] = right+1;
                return res;
            } else if(num > target) {
                right --;
            } else {
                left ++;
            }
        }
        return res;
    }
}