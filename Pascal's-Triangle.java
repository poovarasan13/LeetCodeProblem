class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> array=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        list.add(1);
        array.add(list);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> subList=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0|| j==i)
                   subList.add(1);
                else{
                    List<Integer> previous=array.get(i-1);
                    subList.add(previous.get(j-1)+previous.get(j));
                }
            }
            array.add(subList);
        }

        return array;
    }
}