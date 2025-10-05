// Last updated: 10/5/2025, 12:27:12 PM
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> mm = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int i=0;i < fruits.length;i++){
            mm.put(fruits[i], mm.getOrDefault(fruits[i], 0)+1);
            
            while(mm.size() > 2) {
                mm.put(fruits[left], mm.get(fruits[left]) - 1);
                if (mm.get(fruits[left]) == 0) {
                    mm.remove(fruits[left]);
                }
                left++;
            }
            res = Math.max(res, i - left+1);
        }
        return res;
    }
}