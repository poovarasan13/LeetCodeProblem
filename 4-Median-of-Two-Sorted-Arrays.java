class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int len=m+n;
        int [] array=new int[len];
        int a=0;
        for(int i=0;i<n;i++)
        {
            array[a++]=nums1[i];
        }
        for(int j=0;j<m;j++)
        {
            array[a++]=nums2[j];
        }
        Arrays.sort(array);
        double val=0;
        if(len%2==0)
        {
            int i=len/2;
            val=(double)(array[i]+array[i-1])/2.0;
        }
        else{
            int i=len/2;
            val=(double)(array[i]);
        }
         return val;
    }
}