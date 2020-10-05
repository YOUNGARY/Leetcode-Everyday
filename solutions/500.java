class Solution {
    public String[] findWords(String[] words) {
        int[] line = new int[26];
        for (char ch : "qwertyuiop".toCharArray()) {
            line[ch - 'a'] = 1;
        }
        for (char ch : "asdfghjkl".toCharArray()) {
            line[ch - 'a'] = 2;
        }
        for (char ch : "zxcvbnm".toCharArray()) {
            line[ch - 'a'] = 3;
        }

        List<String> res = new LinkedList<>();
        for (String word : words) {
            int lastChar = line[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean isSameLine = true;
            for (char ch : word.toLowerCase().toCharArray()) {
                if (line[ch - 'a'] != lastChar) {
                    isSameLine = false;
                    break;
                }
            }
            if (isSameLine) {
                res.add(word);
            }
        }
        String[] ans = new String[res.size()];
        int idx = 0;
        for (String s : res) {
            ans[idx++] = s;
        }
        return ans;
    }
}