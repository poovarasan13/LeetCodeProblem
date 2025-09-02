class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int[] g:grid)
        {
            Arrays.sort(g);
        }
       for(int i=0;i<m;i++)
       {
        int max=0;
        for(int j=0;j<n;j++)
        {
            if(max<grid[j][i])
              max=grid[j][i];
            // System.out.print(grid[j][i]+" ");
        }
        ans+=max;
        //  System.out.println();
       }
        return ans;
        
    }
}