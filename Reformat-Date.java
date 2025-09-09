class Solution {
    public String reformatDate(String date) {
        String str="";
        String [] s=date.split(" ");
        int n=s.length;
        for(int i=0;i<n;i++)
        {
            if(i==1)
            {
                if(s[i].equals("Jan")) str="01-"+str;
                if(s[i].equals("Feb")) str="02-"+str;
                if(s[i].equals("Mar")) str="03-"+str;
                if(s[i].equals("Apr")) str="04-"+str;
                if(s[i].equals("May")) str="05-"+str;
                if(s[i].equals("Jun")) str="06-"+str;
                if(s[i].equals("Jul")) str="07-"+str;
                if(s[i].equals("Aug")) str="08-"+str;
                if(s[i].equals("Sep")) str="09-"+str;
                if(s[i].equals("Oct")) str=10+"-"+str;
                if(s[i].equals("Nov")) str=11+"-"+str;
                if(s[i].equals("Dec")) str=12+"-"+str;

            }else if(i==0)
            {
                int l=s[i].length();
                int a=Integer.parseInt(s[i].substring(0,l-2)+str);
                if(a<10)
                      str= "0"+s[i].substring(0,l-2)+str;
                else
                     str= s[i].substring(0,l-2)+str; 
            }else
            str=s[i]+"-"+str;
        }
        return str;
    }
}