class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int pre=0,suf=0;
        for(int i=start;i!=destination;i=(i+1)%n) pre+=distance[i];
        for(int i=destination;i!=start;i=(i+1)%n) suf+=distance[i];
        return Math.min(pre,suf);
    }
}