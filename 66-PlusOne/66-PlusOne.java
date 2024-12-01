class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return early
            }
            digits[i] = 0; // Reset to 0 and continue to handle carry
        }

        // If we exit the loop, all digits were 9, so we need an extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result;
    }
}