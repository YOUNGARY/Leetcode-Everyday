class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        int len = words.length;
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < len; i++) {
            if (words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u") ||
                    words[i].startsWith("A") || words[i].startsWith("E") || words[i].startsWith("I") || words[i].startsWith("O") || words[i].startsWith("U")) {
                ans.append(words[i]);
            } else {
                ans.append(words[i].substring(1)).append(words[i].charAt(0));
            }
            ans.append("ma");
            for (int j = 0; j <= i; j++) {
                ans.append("a");
            }
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}