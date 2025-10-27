// Last updated: 10/27/2025, 6:02:35 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstColumnImpacted = false;
        boolean firstRowImpacted = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i< rows;i++) {
            if(matrix[i][0] == 0) {
                firstRowImpacted = true;
                break;
            }
        }
        for(int j=0;j<cols;j++) {
            if(matrix[0][j] == 0) {
                firstColumnImpacted = true;
                break;
            }
        }

        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i< matrix.length;i++) {
            for(int j=1;j < matrix[i].length;j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowImpacted) {
            for(int i=0;i< rows;i++) {
                matrix[i][0] = 0;
            }
        }
        if(firstColumnImpacted) {
            for(int j=0;j< cols;j++) {
                matrix[0][j] = 0;
            }
        }
    }
}