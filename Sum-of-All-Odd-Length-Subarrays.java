class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
           int total=(i+1)*(n-i);
           int sub=(total+1)/2;
           System.out.println(sub);
            result+=sub*arr[i];
        }
        return result;
    }
}