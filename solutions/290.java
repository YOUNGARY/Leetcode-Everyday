class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pc = pattern.toCharArray();
        int len = pattern.length();
        String[] sPattern = s.split(" ");
        if (sPattern.length != len) {
            return false;
        }
        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (charMap.get(pc[i]) == null) {
                charMap.put(pc[i], sPattern[i]);
                if (stringMap.get(sPattern[i]) == null) {
                    stringMap.put(sPattern[i], pc[i]);
                } else {
                    return false;
                }
            } else {
                if (!charMap.get(pc[i]).equals(sPattern[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
