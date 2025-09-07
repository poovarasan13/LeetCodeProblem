class Solution {
    public String interpret(String command) {
       int n=command.length();
       String str="";
       for(int i=0;i<n-1;i++)
       {
        char ch1=command.charAt(i);
        char ch2=command.charAt(i+1);
        if(ch1=='(' &&ch2==')')
        {
            str+='o';
        }
        else if((ch1>='a' && ch1<='z') ||(ch1>='A' && ch1<='Z') ){
              str+=ch1;
        }
       }
       char c=command.charAt(n-1);
       if(c!=')')
          str+=c;
       return str; 
    }
}