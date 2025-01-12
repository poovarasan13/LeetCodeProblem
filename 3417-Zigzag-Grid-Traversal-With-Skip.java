class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
                int m=grid.length;
        int n=grid[0].length;
        List<Integer> answer=new ArrayList<>();
        // list.add(grid[0][0]);
        for(int i=0;i<m;i++)
            {
              if(i%2==0)
              {
                  for(int j=0;j<n;j=j+2){
                      answer.add(grid[i][j]);
                  }
              }
              else{
if(n%2==0){
                  for(int j=n-1;j>=1;j=j-2)
                  {
                      answer.add(grid[i][j]);
                  }}
                  else{
                      for(int j=n-2;j>=1;j=j-2)
                  {
                      answer.add(grid[i][j]);
                  }
                  }
              }
            }
        return answer;
    }
}