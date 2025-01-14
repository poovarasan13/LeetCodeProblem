class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
         int[] freq=new int[n+1];
         int[] answer=new int[n];
         int cnt=0;
         List<Integer> list=new ArrayList<>();
         for(int i=0;i<n;i++)
         {     
            if(list.contains(A[i]))    cnt++;
            else   list.add(A[i]);
            if(list.contains(B[i])) cnt++;
            else list.add(B[i]);
            answer[i]=cnt;
         }
         return answer;
         
    }
}