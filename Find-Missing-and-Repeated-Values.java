class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=(n*n);i++)
        {
            map.put(i,0);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                  map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int a=0,b=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(m.getValue()==0)
                b=m.getKey();
            if(m.getValue()==2)
                a=m.getKey();
        }
        int [] answer=new int[2];
        answer[0]=a;
        answer[1]=b;
        return answer;
    }
}