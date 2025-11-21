class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<=n+1;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            map.get(u).add(v);
            map.get(v).add(u);
        }
        Set<Integer> set=new HashSet<>();
        return dfs(source,destination,map,set);
    }
        public static boolean dfs(int sou,int dest,Map<Integer,List<Integer>> map,Set<Integer> visited)
        {
            if(sou==dest) return true;
            visited.add(sou);
            for(int m:map.get(sou))
            {
                if(!visited.contains(m))
                {
                    if(dfs(m,dest,map,visited))
                    {
                      return true;  
                    }
                }
            }
            return false;
        }
}