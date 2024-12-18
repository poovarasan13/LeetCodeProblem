class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] board=new char[n][n];
        List<List<String>> answer=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        queen(board,0,n,answer);
        return answer;
    }
    public void queen(char [][]board,int row,int n,List<List<String>> answer)
    {
       if(row==n)
       {
        answer.add(build(board,n));
        return;
       }
        for(int col=0;col<n;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]='Q';
                queen(board,row+1,n,answer);
                board[row][col]='.';
            }
        }
    }
    public List<String> build(char [][] board,int n)
    {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str="";
            for(int j=0;j<n;j++)
            {
                   str+=board[i][j];
            }
            ans.add(str);
        }
        return ans;
    }
    public boolean isSafe(char [][]board,int row,int col)
    {
        for(int i=row,j=col;i>=0;i--)
        {
            if(board[i][j]=='Q') return false;

        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col ; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
       return true;
    } 
}