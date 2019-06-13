/*
 * TODO 复杂度不合理
 */
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] topMax = new int[50];
        int[] leftMax = new int[50];
        for(int i=0;i<grid[0].length;i++) {
            int[] tempGrid = new int[50];
            for(int j=0;j<grid.length;j++) {
                tempGrid[j] = grid[j][i];
            }
            topMax[i] = getMaxNumInGrid(tempGrid);
        }
        for(int i=0;i<grid.length;i++) {
            leftMax[i] = getMaxNumInGrid(grid[i]);
        }
        int maxIncrease = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                maxIncrease += Math.min(leftMax[i], topMax[j]) - grid[i][j];
            }
        }
        return maxIncrease;
    }
    
    public int getMaxNumInGrid(int[] grid) {
        int maxNum = 0;
        for(int i=0;i<grid.length;i++) {
            if(grid[i] > maxNum) {
                maxNum = grid[i];
            }
        }
        return maxNum;
    }
}