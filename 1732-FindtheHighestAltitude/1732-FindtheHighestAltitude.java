class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int currentAltitude = 0;
        for(int i=0;i<gain.length;i++) {
            currentAltitude += gain[i];
            res = Math.max(res, currentAltitude);
        }
        return res;
    }
}