// Last updated: 10/13/2025, 12:18:13 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        double ans=-Double.MAX_VALUE;
        double avg=(sum)/(double)k;
        ans=Math.max(ans,avg);
        int i=0;
        int j=k;
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            avg=(sum)/(double)k;
            ans=Math.max(ans,avg);
            i++;
            j++;
        }
        return ans;
        
    }
}