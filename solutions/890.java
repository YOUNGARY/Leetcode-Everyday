class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        LinkedList<String> res = new LinkedList<>();
        for (String word : words) {
            if (isPattern(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    public boolean isPattern(String word, String pattern) {
        HashMap<Character, Character> wordMap = new HashMap<>();
        HashMap<Character, Character> patternMap = new HashMap<>();
        int len = pattern.length();
        for (int i = 0; i < len; i++) {
            if (wordMap.getOrDefault(word.charAt(i), '?').equals('?') && patternMap.getOrDefault(pattern.charAt(i), '?').equals('?')) {
                wordMap.put(word.charAt(i), pattern.charAt(i));
                patternMap.put(pattern.charAt(i), word.charAt(i));
            } else if (!wordMap.getOrDefault(word.charAt(i), '?').equals(pattern.charAt(i)) || 
                    !patternMap.getOrDefault(pattern.charAt(i), '?').equals(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}