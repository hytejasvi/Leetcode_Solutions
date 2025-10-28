// Last updated: 10/28/2025, 11:31:48 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int dir = 0;
        //dir = 0 --> moving from left to right
        //dir = 1 --> moving from top to bottom
        //dir = 2 --> moving from right to left
        //dir = 3 --> moving from bottom to top
        int top = 0;
        int left = 0;
        int down = matrix.length-1;
        int right = matrix[0].length-1;
        while(top <= down && left <= right) {
            if(dir == 0) {
                for(int i=left;i<=right;i++) {
                    res.add(matrix[top][i]);
                }
                top++;
                dir=1;
            } else if(dir ==1) {
                for(int i= top;i <= down;i++) {
                    res.add(matrix[i][right]);
                }
                right--;
                dir = 2;
            } else if(dir == 2) {
                for(int i=right;i>= left;i--) {
                    res.add(matrix[down][i]);
                }
                down--;
                dir = 3;
            } else {
                for(int i=down;i >= top;i--) {
                    res.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return res;
    }
}