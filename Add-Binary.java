class Solution {
    public String addBinary(String a, String b) {
      StringBuilder strb=new StringBuilder();
      int i=a.length()-1,j=b.length()-1;
      int carry=0;
      while(i>=0 || j>=0|| carry>0)
      {
           int num1=i>=0?a.charAt(i)-'0':0;
           int num2=j>=0?b.charAt(j)-'0':0;
           int sum=num1+num2+carry;
           strb.append((char)((sum%2)+'0'));
           carry=sum/2;
           i--;
           j--;
      }
    //  System.out.println(strb);
      return strb.reverse().toString();
    }
}