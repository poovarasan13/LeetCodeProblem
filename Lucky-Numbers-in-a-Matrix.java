class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int[] min=new int[n];
        int[] max=new int[m];
        List<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        int temp=Integer.MAX_VALUE,idx=-1;
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]<temp)
            {
             temp=matrix[i][j];
             idx=j;
            }
        }
        boolean flag=true;
        // System.out.println(temp);
        for(int k=0;k<n;k++)
        {
            if(matrix[k][idx]>temp) flag=false;
        }
        if(flag) list.add(temp);
       }
      return list;
    }
}