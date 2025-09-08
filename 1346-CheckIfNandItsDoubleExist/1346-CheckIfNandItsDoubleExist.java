// Last updated: 9/8/2025, 2:27:05 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int n: arr) {
            if((mySet.contains(n*2)) ||(n%2==0 && (mySet.contains(n/2)))) {
                return true;
            } else {
                mySet.add(n);
            }
        }
        return false;

    }
}