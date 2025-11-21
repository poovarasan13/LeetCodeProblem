class Solution {
    public int findCenter(int[][] edges) {
        int len=edges.length;
        HashMap<Integer,List<Integer>> adjList =new HashMap<>();
        for(int i=0;i<=len+1;i++)
        {
            adjList.put(i,new ArrayList<>());
        }
        for(int i=0;i<len;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for(int i=0;i<=len+1;i++)
        {
            int size=adjList.get(i).size();
            if(size>1) return i; 
        }
        return 0;
    }
}