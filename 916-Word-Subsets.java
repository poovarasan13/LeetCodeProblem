class Solution {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int m = words1.length, n = words2.length;
        List<String> list = new ArrayList<>();
        int[] count = new int[26];
        for (String str : words2) {
            int[] temp = new int[26];
            for (int i = 0; i < str.length(); i++) {
                temp[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                count[i] = Math.max(count[i], temp[i]);
            }
        }

        for (String s : words1) {
            int flag = 0;
            int[] freq = new int[26];
            int len = s.length();
            for (int j = 0; j < len; j++) {
                freq[s.charAt(j) - 'a']++;
            }
            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0)
                    cnt++;
            }
            // System.out.println(s);
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0 && count[i] <= freq[i]) {
                    // System.out.println(i + 'a' + " " + count[i] + freq[i]);
                    flag++;
                }

            }

            for (int i = 0; i < 26; i++) {

            }
            if (flag == cnt)
                list.add(s);
        }

        return list;
    }

    // public boolean check(String a,HashMap<Character,Integer> map)
    // {
    // int len=a.length();

    // for(int i=0;i<26;i++)
    // {

    // }
    // }

}