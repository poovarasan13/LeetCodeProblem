class Solution {
    public String truncateSentence(String s, int k) {
       String str [] =s.split(" ");
       int n=str.length;
       StringBuilder strb=new StringBuilder();
       for(int i=0;i<k;i++)
       {
        strb.append(str[i]+" ");
       }
           return strb.toString().trim(); 
    }

}