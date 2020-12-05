class Solution {
    public String sortString(String s) {
        int len = s.length();
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        while (ans.length() != len) {
            for (int i = 0; i < 26; i++) {
                if (letters[i] > 0) {
                    ans.append((char) (i + 'a'));
                    letters[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (letters[i] > 0) {
                    ans.append((char) (i + 'a'));
                    letters[i]--;
                }
            }
        }
        return ans.toString();
    }
}