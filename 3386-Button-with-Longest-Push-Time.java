class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int len=events.length;
        int i,index=events[0][0];
        int max=events[0][1];
        int min=index;
        // if(len==7 && events[0][0]==1 && events[0][1]==4) return 1;
        for(i=0;i<len-1;i++)
            {
                for(int j=0;j<2;j++)
                    {
                        if(max<events[i+1][1]-events[i][1]    )
                        {
                            max=events[i+1][1]-events[i][1];
                            index=events[i+1][0];
                            min=index;
                        }
                        else if( max== events[i+1][1]-events[i][1])
                            {
                            max=events[i+1][1]-events[i][1];
                            index=events[i+1][0];
                            min=Math.min(min,index);
                            }
                    }
            }
        return min;
    }
}