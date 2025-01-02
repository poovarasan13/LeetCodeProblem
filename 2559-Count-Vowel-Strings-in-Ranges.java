class Solution {
    // public void search(int[] answer,String[] words,int start,int end,int p )
    // { int cnt=0;
    //     for(int i=start;i<=end;i++)
    //     {
    //         String s=words[i];
    //         int len=s.length();    
    //              if(present(s.charAt(0)) && present(s.charAt(len-1)) )
    //                   {
    //                     cnt++;                  
    //                   }
    //     }
    //     answer[p]=cnt;
    // }
    public boolean present(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
    //    int n=queries.length;
    //     int[] answer=new int[n];
        
    //     for(int i=0;i<n;i++)
    //     {
    //         int st=queries[i][0];
    //         int end=queries[i][1];
    //          search(answer,words,st,end,i);   
    //     } 
    //     return answer;

         int n=words.length;
         int[] prefix=new int[n+1];
         for(int i=0;i<n;i++)
         {
            String ch=words[i];
            int len=ch.length();
            if((present(ch.charAt(0))) && (present(ch.charAt(len-1))))
            {
                prefix[i+1]=prefix[i]+1;
            }
            else prefix[i+1]=prefix[i];
         }
         int m=queries.length;
          int[] answer=new int[m];
          for(int i=0;i<m;i++)
          {
            int start=queries[i][0];
            int end=queries[i][1];
            answer[i]=prefix[end+1]-prefix[start];
          }
          return answer;
    }
}