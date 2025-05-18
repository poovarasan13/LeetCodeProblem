class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<List<Integer>> answer=new ArrayList<>();
      List<Integer> l1 =new ArrayList<>();
      l1.add(1);
      answer.add(l1);
      for(int i=1;i<=rowIndex;i++)
      {
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<=i;j++)
        {
            if(j==0 || j==i) list.add(1);
            else if(j>0 && j<i)
            {
                List<Integer> curr=answer.get(i-1);
                list.add(curr.get(j-1)+curr.get(j));
            }
        }
        answer.add(list);
      }
      return answer.get(rowIndex); 
    }
}