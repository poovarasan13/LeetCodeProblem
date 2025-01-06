class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                row[i]=-1;
                col[j]=-1;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(row[i]==-1){
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            if(col[j]==-1){
              for(int i=0;i<m;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}