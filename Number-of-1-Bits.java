class Solution {
    public int hammingWeight(int n) {
       int cnt=0;
       for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                cnt += 1;
            }
        }
       return cnt;
    }
}