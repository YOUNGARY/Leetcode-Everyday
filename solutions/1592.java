class Solution {
    public String reorderSpaces(String text) {
        int spacesCnt = text.length() - text.replaceAll(" ", "").length();
        if (spacesCnt == 0) {
            return text;
        }
        String[] words = text.split(" ");
        int len = 0;
        for (String word : words) {
            if (!word.equals("")) {
                len++;
            }
        }
        int spaceNum;
        if (len == 1) {
            spaceNum = spacesCnt;
        } else {
            spaceNum = spacesCnt / (len - 1);
        }
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            if (!word.equals("")) {
                res.append(word);
                for (int i = 0; spacesCnt > 0 && i < spaceNum; i++) {
                    res.append(" ");
                    spacesCnt--;
                }
            }
        }
        
        while (spacesCnt-- > 0) {
            res.append(" ");
        }

        return res.toString();
    }
}
