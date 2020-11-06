class Solution {
    public boolean checkRecord(String s) {
        int cntA = 0, len = s.length(), cntL = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (c[i] == 'A') {
                cntA++;
                cntL = 0;
                if (cntA > 1) {
                    return false;
                }
            } else if (c[i] == 'L') {
                cntL++;
                if (cntL > 2) {
                    return false;
                }
            } else {
                cntL = 0;
            }
        }
        return true;
    }
}