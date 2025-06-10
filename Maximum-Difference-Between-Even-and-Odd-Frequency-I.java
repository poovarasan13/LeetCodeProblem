class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int emax=Integer.MAX_VALUE,omax=0;
        for(Map.Entry<Character,Integer>m:map.entrySet())
        {
            if(m.getValue()%2==0 ) emax=Math.min(m.getValue(),emax);
            else omax=Math.max(omax,m.getValue());
        }
        // String s="";
        // Scanner sc=new Scanner(System.in);
        // s=sc.next();
        // System.out.println(emax+" "+omax);
        return (omax-emax);
    }
}