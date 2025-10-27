class Solution {
    public int numberOfBeams(String[] bank) {
        int a = 0, b = 0, ans = 0;
        int m = bank.length;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (char c : bank[i].toCharArray()) {
                if (c == '1')
                    sum++;
            }
            if (sum != 0) {
                b = a;
                a = sum;
                ans = ans + (a * b);
                // System.out.println(a+" "+b);
            }
        }
        return ans;
    }
}