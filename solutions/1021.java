class Solution {
    public String removeOuterParentheses(String S) {
        char[] ch = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        int start = 0, stackLen = 0;
        for (int i = 0; i < S.length(); i++) {
            if (ch[i] == '(') {
                stackLen += 1;
            } else {
                stackLen -= 1;
                if (stackLen == 0) {
                    for (int j = start + 1; j < i; j++) {
                        sb.append(ch[j]);
                    }
                    start = i + 1;
                }
            }
        }
        return sb.toString();
    }
}