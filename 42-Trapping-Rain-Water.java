class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int [] p=new int[len];
        int [] s=new int[len];
        p[0]=height[0];
        for(int i=1;i<len;i++)
        {
            p[i]=Math.max(p[i-1],height[i]);
        }
        s[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--)
        {
            s[i]=Math.max(s[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<len;i++)
        {
                   water+=Math.min(p[i],s[i])-height[i];
        }
        return water;
    }
}