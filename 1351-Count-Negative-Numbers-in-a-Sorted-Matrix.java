class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(0>grid[i][j])
                    cnt++;
            }
        }
        return cnt;
    }
}