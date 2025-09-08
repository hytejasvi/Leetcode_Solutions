// Last updated: 9/8/2025, 4:02:53 PM
class Solution {
    public int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;

        for (int n : nums) {
            long num = n;
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
    }
}