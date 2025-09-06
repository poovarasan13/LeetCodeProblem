class Solution {
    public int findChampion(int[][] grid) {
       int m=grid.length;
    int n=grid[0].length;
       int[] arr=new int[m];
       for(int i=0;i<m;i++)
       {
         int sum=0;
         for(int j=0;j<n;j++)
         {
            sum+=grid[i][j];
         }
         arr[i]=sum;
       }
       int max=0,idx=0;
       for(int i=0;i<m;i++)
       {
        if(max<arr[i])
        {
            max=arr[i];
            idx=i;
        }
       }
       return idx;   
    }
}