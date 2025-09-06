class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
        while(sb.length()<32)
        {
            sb.insert(0,'0');
        }
        return Integer.parseInt(sb.reverse().toString(),2);
    }
}