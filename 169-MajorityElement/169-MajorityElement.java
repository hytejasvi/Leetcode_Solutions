// Last updated: 9/12/2025, 10:33:23 PM
class Solution {
    public int majorityElement(int[] nums) {
        /*Map<Integer, Integer> myMap = new HashMap<>();
        int n = nums.length/2;        
        for(int num: nums) {
            myMap.put(num, myMap.getOrDefault(num, 0)+1);
            if (myMap.get(num) > n) {
            return num;
        }
        }
        return n;*/

        // a single pass with no extra memory:
        int num = 0;
        int count = 0;
        int n = nums.length / 2;
        for(int a: nums) {
            if(count == 0) {
                num = a;
            }
            //count += num==a ? 1: -1; short way of if-else
            if(num ==a) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
}