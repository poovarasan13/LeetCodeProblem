class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++)
        {   Set<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++)
            {
                set.add(matrix[i][j]);
            }
            if(set.size()!=n) return false;
        }
        
        for(int j=0;j<n;j++)
        {   Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                set.add(matrix[i][j]);
            }
            if(set.size()!=n) return false;
        }
        return true;
    }
}