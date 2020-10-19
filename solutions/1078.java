class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] c = text.split(" ");
        LinkedList<String> ans = new LinkedList<>();
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i].equals(first) && c[i + 1].equals(second)) {
                if (i + 2 < c.length) {
                    ans.add(c[i + 2]);
                }
            }
        }

        return ans.toArray(new String[ans.size()]);
    }
}