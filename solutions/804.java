class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (char c : words[i].toCharArray()) {
                sb.append(morseCode[c - 'a']);
            }
            map.put(sb.toString(), 1);
        }
        return map.size();
    }
}