class Solution {
    public int reverseDegree(String s) {
       int res=0,i=1;
       for(char ch:s.toCharArray())
       {
        int n=26 - (int)(ch-97);
        res+=(i*n);
        System.out.println(i+" "+ n);
        i++;

       } 
       return res;
    }
}