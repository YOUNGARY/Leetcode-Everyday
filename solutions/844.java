class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (ss.length() > 0) {
                    ss.deleteCharAt(ss.length() - 1);
                }
            } else {
                ss.append(c);
            }
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (tt.length() > 0) {
                    tt.deleteCharAt(tt.length() - 1);
                }
            } else {
                tt.append(c);
            }
        }
        return ss.toString().equals(tt.toString());
    }
}
