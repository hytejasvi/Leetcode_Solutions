// Last updated: 9/13/2025, 1:07:16 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        /*int[] posArr = new int[nums.length/2];
        int[] negArr = new int[nums.length/2];
        int[] res = new int[nums.length];
        int j=0;
        int pos=0;
        int neg=0;
        for(int n: nums) {
            if(n > 0) {
                posArr[pos] = n;
                pos++;
            } else {
                negArr[neg] = n;
                neg++;
            }
        }
        int k=0;
        for(int i: posArr) {
            res[k] = i;
            k +=2;
        }
        k=1;
        for(int i: negArr) {
            res[k] = i;
            k +=2;
        }
        return res;*/

        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int n: nums) {
            if(n > 0) {
                res[pos] = n;
                pos +=2;
            } else {
                res[neg] = n;
                neg +=2;
            }
        }
        return res;
    }
}