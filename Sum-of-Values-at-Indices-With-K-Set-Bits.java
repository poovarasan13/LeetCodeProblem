class Solution {
    public String binary(int n)
    {
       String str="";
       while(n!=0)
       {
        str+=n%2;
        n=n/2;
       }
    //    System.out.println(str);
       return str; 
    }
    public List<String> BinaryBit(List<String> list ,int n)
    {
      
        for(int i=0;i<n;i++)
        {
            list.add(binary(i));
        }
      return list;
    }
    public int oneCount(String str)
    {
        int n=str.length();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='1') cnt++; 
        }
       return cnt;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int n=nums.size();
       List<String> list=new ArrayList<>();
       BinaryBit(list,n);
       int sum=0;
       for(int i=0;i<n;i++)
       {
        if(oneCount(list.get(i))==k)
         {
            sum=sum+nums.get(i);
         }
       }
       return sum; 
    }
}