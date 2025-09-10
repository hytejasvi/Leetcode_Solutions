// Last updated: 9/10/2025, 11:41:40 AM
class Solution {
    
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while (mid<=high){
            if (nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            } else if (nums[mid]==1){
                mid++;
            }else if (nums[mid]==2){
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
        //for (int k=0;k<nums.length;k++) System.out.print(nums[k]);
    }
}