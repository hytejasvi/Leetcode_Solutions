class NumArray {
    int[] sumArray ;
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sumArray = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum = sum+nums[i];
            sumArray[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int res=0;
        res = sumArray[right] - sumArray[left]+nums[left];
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */