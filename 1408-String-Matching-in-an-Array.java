class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].contains(words[j])) {
                    if (!answer.contains(words[j]))
                        answer.add(words[j]);
                }

                if (words[j].contains(words[i])) {
                    if (!answer.contains(words[i]))
                        answer.add(words[i]);
                }
            }
        }

        return answer;
    }
}