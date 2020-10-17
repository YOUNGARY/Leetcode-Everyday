class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        char[] sc = new char[hashMap.keySet().size()];
        int idx = 0;
        for (Character c : hashMap.keySet()) {
            sc[idx++] = c;
        }

        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < sc.length - 1; i++) {
            for (int j = 0; j < sc.length - 1 - i; j++) {
                if (hashMap.get(sc[j]) < hashMap.get(sc[j + 1])) {
                    char temp = sc[j];
                    sc[j] = sc[j + 1];
                    sc[j + 1] = temp;
                }
            }
        }
        for (char c : sc) {
            for (int i = 0; i < hashMap.get(c); i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}