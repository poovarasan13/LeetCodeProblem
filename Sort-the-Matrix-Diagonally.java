class Solution {
    public int[][] diagonalSort(int[][] mat) {
            Map<Integer,List<Integer>> map=new HashMap<>();
            int n=mat.length;
            int m=mat[0].length;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int val=i-j;
                    map.putIfAbsent(val,new ArrayList<>());
                    map.get(val).add(mat[i][j]);
                }
            }
            for(Map.Entry<Integer,List<Integer>> mp:map.entrySet())
            {
                Collections.sort(mp.getValue());
            }
             for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int val=i-j;
                    mat[i][j]=map.get(val).remove(0);
                }
            }
            return mat;
    }
}