class Solution {
    public int longestPalindrome(String[] words) {
      int[][] map=new int[26][26];
      int cnt=0,temp=0;
      for(String str:words)
      {
        int f=str.charAt(0)-'a',s=str.charAt(1)-'a';
        if(map[s][f]>0)
        {
            map[s][f]--;
            cnt+=4;
            if(f==s)temp--;
        }
        else{
           map[f][s]++;
           if(f==s) temp++;
        }
      }
      if(temp>0) cnt+=2;
      return cnt;  
    }
}