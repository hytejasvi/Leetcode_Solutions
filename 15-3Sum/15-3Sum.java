// Last updated: 10/3/2025, 10:35:39 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++) {
            
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = nums[i] + nums[right] + nums[left];
                if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[right], nums[left]));

                    while(left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right -1]) {
                        right --;
                    }
                    left++;
                    right --;
                }
            }
        }
        return res;
    }
}