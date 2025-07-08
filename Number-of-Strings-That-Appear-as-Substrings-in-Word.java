class Solution {
    public int numOfStrings(String[] patterns, String word) {
        long cnt=Arrays.stream(patterns).filter(word::contains).count();
        return (int)cnt;
    }
}