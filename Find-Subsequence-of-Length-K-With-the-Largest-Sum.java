class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[k];
        int[][] indexvalue=new int[n][2];
        for(int i=0;i<n;i++)
        {
            indexvalue[i][0]=nums[i];
            indexvalue[i][1]=i;
        }
        Arrays.sort(indexvalue,(a,b)->b[0]-a[0]);
        int [][] karray=Arrays.copyOfRange(indexvalue,0,k);
        Arrays.sort(karray,(a,b)->a[1]-b[1]);
        for(int i=0;i<k;i++){
            result[i]=karray[i][0];
        }
        return result;
    }
}