class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] answer=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
              answer[k++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==pivot)
              answer[k++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>pivot)
              answer[k++]=nums[i];
        }
        return answer;
    }
}