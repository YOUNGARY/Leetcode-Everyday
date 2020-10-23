class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s = S.replaceAll("-", "");
        if (s.length() == 0) {
            return "";
        }
        char[] c = s.toCharArray();
        int cLen = c.length;
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        for (int i = cLen - 1; i >= 0; i--) {
            res.append(c[i]);
            cnt++;
            if (cnt % K == 0) {
                res.append("-");
            }
        }

        if (res.charAt(res.length() - 1) == '-') {
            return res.reverse().substring(1).toUpperCase();
        } else {
            return res.reverse().toString().toUpperCase();
        }
    }
}