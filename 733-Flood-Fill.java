class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
       dfs(image,sr,sc,color,image[sr][sc]);
       return image;
        
    }
    public void dfs(int[][] grid,int x,int y,int color,int old)
    {
        if(x<0 || x>=grid.length || y<0 || y>= grid[0].length || grid[x][y]!=old) 
          return ;
          grid[x][y]=color;
        dfs(grid,x,y-1,color,old);
        dfs(grid,x,y+1,color,old);
        dfs(grid,x-1,y,color,old);
        dfs(grid,x+1,y,color,old);
        
    }
}