class Solution {
    public int[][] transpose(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                res[col][row] = mat[row][col];
            }
        }

        return res;        
    }
}