class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] keys = keysPressed.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put(keys[0], releaseTimes[0]);
        for (int i = 1; i < releaseTimes.length; i++) {
            hashMap.put(keys[i], Integer.max(hashMap.getOrDefault(keys[i], 0), releaseTimes[i] - releaseTimes[i - 1]));
        }
        int max = 0;
        char ans = 0;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            } else if (entry.getValue() == max) {
                ans = (char) Integer.max(ans, entry.getKey());
            }
        }
        return ans;
    }
}