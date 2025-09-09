// Last updated: 9/9/2025, 2:00:23 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        List<Integer> resList = new ArrayList<>();

        for(int n: nums1) {
            s1.add(n);
        }
        
        for(int n: nums2) {
            if(s1.contains(n)) {
                resList.add(n);
                s1.remove(n);
            }
        }
        int[] res = new int[resList.size()];
        for(int i=0;i< resList.size();i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}