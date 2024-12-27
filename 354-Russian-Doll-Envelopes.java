class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int[] dp = new int[n];
     
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int l = 0, h = ans;
            while (l < h) {
                int mid = (h + l) / 2;
                if (dp[mid] < envelopes[i][1])
                    l = mid + 1;
                else
                    h = mid;
            }
            dp[l] = envelopes[i][1];
            if (l == ans)
                ans++;
        }
        return ans;
    }
}