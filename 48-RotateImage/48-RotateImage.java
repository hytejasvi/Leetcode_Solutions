// Last updated: 10/26/2025, 4:14:19 PM
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int left = 0, right = matrix.length-1;
        while(left < right) {
            for(int j=0;j< matrix.length;j++) {
                int temp = matrix[j][left];
                matrix[j][left] = matrix[j][right];
                matrix[j][right] = temp;
            }
            left++;
            right--;
        }
    }
}