class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && logs[i].equals("../"))
                st.pop();
            else if (logs[i].equals("./") || logs[i].equals("../"));
            else
                st.push(logs[i]);
        }
        // while (!st.isEmpty()) {
        //     System.out.println(st.pop());
        // }
        return st.size();
    }
}