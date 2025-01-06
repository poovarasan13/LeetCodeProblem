class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase();
       
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0,end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
              return false;
              start++;
              end--;
        }
        return true;
    }
}