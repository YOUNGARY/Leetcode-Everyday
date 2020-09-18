class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> roadMap = new HashMap<>();
        for (List<String> l: paths) {
            roadMap.put(l.get(0), l.get(1));
        }
        String nextStop = paths.get(0).get(0);
        while (true) {
            String ans = nextStop;
            nextStop = roadMap.getOrDefault(nextStop,"");
            if (nextStop.length() == 0) {
                return ans;
            }
        }
    }
}