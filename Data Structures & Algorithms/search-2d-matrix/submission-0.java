class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int r = 0; r < matrix.length; r++)
        {
            for(int j = 0; j < matrix[r].length; j++)
            {
                if(matrix[r][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
