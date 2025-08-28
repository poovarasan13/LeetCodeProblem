class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = i - j;
                map.putIfAbsent(val, new ArrayList<>());
                map.get(val).add(grid[i][j]);
            }
        }
        for(int a:map.keySet())
            {
                List<Integer> ans=map.get(a);
                if(a>=0)
                {
                    ans.sort(Collections.reverseOrder());
                }
                else{
                    Collections.sort(ans);
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = i - j;
                grid[i][j] = map.get(val).remove(0);
            }
        }
        return grid;
    }
}