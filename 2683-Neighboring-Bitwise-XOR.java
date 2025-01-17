class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans=0;
        for(int a:derived)
        {
            ans=ans^a;
        }
        if(ans==0) return true;
        return false;
    }
}