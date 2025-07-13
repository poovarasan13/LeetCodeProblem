class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n=players.length,m=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,cnt=0;
        while(i<n && j<m)
        {
            if(players[i]<=trainers[j])
            {
                cnt++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return cnt;
    }

}