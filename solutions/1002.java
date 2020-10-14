class Solution {
    public List<String> commonChars(String[] A) {
        List<HashMap<Character, Integer>> list = new LinkedList<>();
        for (String a : A) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : a.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            list.add(map);
        }
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            int less = Integer.MAX_VALUE;
            for (HashMap<Character, Integer> map : list) {
                int temp = map.getOrDefault(c, -1);
                if (temp == -1) {
                    less = -1;
                    break;
                }
                if (temp < less) {
                    less = temp;
                }
            }
            if (less > 0) {
                for (int k = 0; k < less; k++) {
                    ans.add(String.valueOf(c));
                }
            }
        }
        return ans;
    }
}