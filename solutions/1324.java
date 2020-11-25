class Solution {
    public List<String> printVertically(String s) {
        String[] ss = s.split(" ");
        List<String> res = new ArrayList<>();
        int maxLen = 0;
        for (String value : ss) {
            maxLen = Integer.max(value.length(), maxLen);
        }
        for (int i = 0; i < maxLen; i++) {
            res.add("");
        }
        for (int i = 0; i < maxLen; i++) {
            for (String value : ss) {
                if (value.length() <= i) {
                    res.set(i, res.get(i) + " ");
                } else {
                    res.set(i, res.get(i) + value.charAt(i));
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            res.set(i, ("A" + res.get(i)).trim().substring(1));
        }
        return res;
    }
}