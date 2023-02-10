class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length ;
        int cols = matrix[0].length ;
        HashSet<Integer> rowSet = new HashSet<Integer>() ;
        HashSet<Integer> colSet = new HashSet<Integer>() ;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(matrix[i][j]==0) {
                    rowSet.add(i) ;
                    colSet.add(j) ;
                }
            }
        }
        for(int i:rowSet) {
            for(int j=0;j<cols;j++) {
                matrix[i][j] =0;
            }
        }
        for(int j:colSet) {
            for(int i=0;i<rows;i++) {
                matrix[i][j] =0;
            }
        }
    }
}