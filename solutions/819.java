class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String ban : banned) {
            hashMap.put(ban, Integer.MIN_VALUE);
        }
        
        StringBuilder word = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else {
                if (word.length() > 0) {
                    if (hashMap.getOrDefault(word.toString(), 0) >= 0) {
                        hashMap.put(word.toString(), hashMap.getOrDefault(word.toString(), 0) + 1);
                    }
                    word = new StringBuilder();
                }
            }
        }
        if (word.length() > 0) {
            if (hashMap.getOrDefault(word.toString(), 0) >= 0) {
                hashMap.put(word.toString(), hashMap.getOrDefault(word.toString(), 0) + 1);
            }
        }
        int maxValue = 0;
        String ans = "";
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                ans = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return ans;
    }
}
