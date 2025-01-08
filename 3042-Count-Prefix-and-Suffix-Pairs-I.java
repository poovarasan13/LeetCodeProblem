class Solution {
    public boolean check(String a, String b) {
        return (b.startsWith(a) && b.endsWith(a));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        int len = words.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (check(words[i], words[j])) {
                    cnt++;
                    // System.out.println(words[j] + " " + words[i]);
                }
            }
        }
        return cnt;
    }
}