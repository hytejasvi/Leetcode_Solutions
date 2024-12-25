class Solution {
    
  int sum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum;
}

int pivotIndex(int[] nums) {
  int leftSum = 0;
  int arraySum = sum(nums);

  for (int i = 0; i < nums.length; ++i) {
    if (leftSum == arraySum - leftSum - nums[i]) {
      return i;
    }
    leftSum += nums[i];
  }

  return -1;
}
}