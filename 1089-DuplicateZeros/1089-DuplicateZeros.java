class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int i=0,k=0;

        while(k<res.length) {
            if (arr[i] != 0) {
                res[k] = arr[i];
                i++;
                k++;
            } else {
                res[k] = 0;
                i++;
                k +=2;
            }
        }

        System.arraycopy(res, 0, arr, 0, res.length);
    }
}
