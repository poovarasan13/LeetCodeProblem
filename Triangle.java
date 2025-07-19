class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
           int row=triangle.size();
           for(int i=row-2;i>=0;i--)
           {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                int down=triangle.get(i+1).get(j);
                int daigonal=triangle.get(i+1).get(j+1);
                int curr=triangle.get(i).get(j);
                triangle.get(i).set(j,curr+Math.min(down,daigonal));
            }

           }
           return triangle.get(0).get(0);
    }
}