class Solution {
    public int countSegments(String s) {
        if(s.trim().equals(\\)) return 0;
       String strs [] = s.trim().split(\\\\\s+\);
        return strs.length;
    }
}