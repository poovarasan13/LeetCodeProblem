class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=edges.length;
        for(int i=1;i<=n+1;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
           int u=edges[i][0];
           int v=edges[i][1];
           map.get(u).add(v);
           map.get(v).add(u);
        }
        for(int i=1;i<=n+1;i++)
        {
            int size=map.get(i).size();
            if(size>1) return i;
            // System.out.print(size);
        }
        return 0;
    }
}