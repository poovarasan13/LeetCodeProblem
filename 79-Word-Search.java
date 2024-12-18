class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(solve(i,j,board,word,0)) return true;
            }
        }
       return false;
    }
    public boolean solve(int i,int j,char[][] board,String word,int size)
    {
                 if(size==word.length()) return true;
                 if(i<0 || j<0 || i>=board.length|| j>=board[0].length || board[i][j]!= word.charAt(size)) return false;
                 char c=board[i][j];
                 board[i][j]='.';
                 boolean up=(solve(i-1,j,board,word,size+1));
                    boolean down=(solve(i+1,j,board,word,size+1));
               boolean left=(solve(i,j-1,board,word,size+1));
                    boolean right=(solve(i,j+1,board,word,size+1));
                       board[i][j]=c;
          return (up || down || left || right);
    }

}