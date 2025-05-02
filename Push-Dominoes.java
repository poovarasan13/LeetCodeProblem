class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
       
        int[] left=new int[n];
        int[] right=new int[n];
        int nearest=-1;
       
        for(int i=n-1;i>=0;i--)
        {
            char c=dominoes.charAt(i);
            if(c=='L') nearest=i;
            else if(c=='R') nearest=-1;
            left[i]=nearest;
        }
        nearest=-1;
        for(int i=0;i<n;i++)
        {
            char c=dominoes.charAt(i);
            if(c=='R') nearest=i;
            else if(c=='L')nearest=-1;
            right[i]=nearest;
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(left[i]+ " "+right[i]);
        // }
        char[] result = new char[n];
        for(int i=0;i<n;i++)
        { char c=dominoes.charAt(i);
            if(c=='.')
            {
              int leftvalue=left[i]==-1 ?Integer.MAX_VALUE:Math.abs(left[i]-i);
              int rightvalue=right[i]==-1 ?Integer.MAX_VALUE:Math.abs(right[i]-i);
              if(leftvalue==rightvalue) result[i]='.';
              else if(leftvalue<rightvalue) result[i]='L';
              else result[i]='R';
            }
            else{
             result[i]=c;
            }
        }
        return new String(result);
    }
}