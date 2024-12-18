class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean solve(char[][] board,int row,int col)
    {
    if(row==9 )
    {
     return true;
    }
     if(col==9)
    {
     boolean temp=solve(board,row+1,0);
     return temp;
    }
    if(board[row][col]!='.') { 
         boolean temp = solve(board,row,col+1);
         return temp;}
            for(char ch='1';ch<='9';ch++)
            {
                 if(valid(board,row,col,ch)){
                       board[row][col]=ch;
                     boolean done=  solve(board,row,col);
                     if(done) return true;
                       board[row][col]='.';
                 }
                
            }
           
           
        return false;
     }
  public boolean valid(char[][]board ,int row,int col,char num)
  {
    for(int i=0;i<9;i++)
    {
        if(board[row][i]==num) return false;
    }
    for(int i=0;i<9;i++)
    {
        if(board[i][col]==num) return false;
    }
    int r=(row/3)*3;
    int s=(col/3)*3;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {

            if(board[r+i][s+j]==num) return false;
        }
    }
    return true;
  }
}