class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1,answer=Integer.MIN_VALUE;
        while(i<j)
        {
            int val=(j-i)*Math.min(height[j],height[i]);
            answer=Math.max(answer,val);

            if(height[i]<height[j]) i++;
            else j--;
        }
        return answer;
    }
}