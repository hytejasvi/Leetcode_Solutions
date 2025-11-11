// Last updated: 11/11/2025, 6:20:08 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        List<Integer> low = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for(int i: nums) {
            if(i<pivot) {
                low.add(i);
            } else if(i > pivot) {
                high.add(i);
            } else {
                mid.add(i);
            }
        }
        int i=0;
        while(i<low.size()) {
            res[i] = low.get(i);
            i++;
        }
        int j=0;
        while(j<mid.size()) {
            res[i] = mid.get(j);
            i++;
            j++;
        }
        int k=0;
        while(k<high.size()) {
            res[i] = high.get(k);
            i++;
            k++;
        }
        return res;
    }
}