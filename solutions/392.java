class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int i = 0, j = 0;
        int sLen = s.length(),  tLen = t.length();
        while (i < sLen && j < tLen) {
            if (sc[i] == tc[j++]) {
                i++;
            }
        }
        return i == sLen;
    }
}