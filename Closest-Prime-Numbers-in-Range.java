class Solution {
    // public boolean isPrime(int value)
    // {

    //     for(int i=2;i<=(value/2);i++)
    //     {
    //         if(value%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;


    // }
    public int[] closestPrimes(int left, int right) {
        int[] answer=new int[2];
        answer[0]=-1;
        answer[1]=-1;
        boolean [] isPrime=new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<=right;i++)
        {
            if(isPrime[i])
            {
               for(int j=2;i*j<=right;j++)
        		{
        			isPrime[i*j]=false;
        		}
            }
        }
        int a=0;
         List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
           if(isPrime[i])
           {
               list.add(i);
           }

        }
       
        int min=999999;
        for(int i=1;i<list.size();i++)
        {
          int diff=list.get(i)-list.get(i-1);
        //   System.out.println(list.get(i)+" "+list.get(i-1)+" "+min+" "+diff);
          if(min>diff  && diff>0)
            {
                min=diff;
                answer[0]=list.get(i-1);
                answer[1]=list.get(i);
            }
        }
        //   System.out.print(set);
        // if(answer[1]==-1) answer[0]=-1;
        //  if(answer[0]==-1) answer[1]=-1;
        return answer;
    }
}