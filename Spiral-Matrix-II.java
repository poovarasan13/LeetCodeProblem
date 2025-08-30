class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int k=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                mat[top][i]=k++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                mat[i][right]=k++;
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                mat[bottom][i]=k++;
            }
            bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    mat[i][left]=k++;
                }
            }
            left++;

        }
        return mat;
    }
}