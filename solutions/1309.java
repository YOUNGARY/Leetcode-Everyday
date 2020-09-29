class Solution {
    public String freqAlphabets(String s) {
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int t = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (i + 2 < len && ch[i + 2] == '#') {
                t = (ch[i] - '0') * 10 + (ch[i + 1] - '0');
                sb.append((char)('a' + t - 1));
                i += 2;
            } else {
                sb.append((char)('a' + ch[i] - '0' - 1));
            }
        }
        return sb.toString();
    }
}