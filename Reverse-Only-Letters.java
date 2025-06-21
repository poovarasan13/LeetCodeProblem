class Solution {
    public String reverseOnlyLetters(String s) {
        String str = "";
        int n = s.length();
        for (char ch : s.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                str += ch;
            }
        }
        int j = str.length() - 1;
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                strb.append(str.charAt(j));
                j--;
            }

            else {
                strb.append(ch);
            }
        }
        return strb.toString();
    }
}