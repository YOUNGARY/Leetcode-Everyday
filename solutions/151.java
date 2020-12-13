class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        int len = ss.length;
        for (int i = len - 1; i >= 0; i--) {
            if (!ss[i].isBlank()) {
                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(ss[i]);
            }
        }
        return res.toString();
    }
}