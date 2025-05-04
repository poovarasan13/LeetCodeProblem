class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int [] freq=new int[100];
        int n=dominoes.length,cnt=0;
        for(int i=0;i<n;i++)
        {
            int min=Math.min(dominoes[i][0],dominoes[i][1]);
            int max=Math.max(dominoes[i][0],dominoes[i][1]);
            int temp=(min*10)+max;
            cnt+=freq[temp];
            freq[temp]++;
        }
        return cnt;
    }
}