class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] t =  cpdomain.split(" ");
            String[] subDomain = t[1].split("[.]");
            String domain = "";
            for (int i = subDomain.length - 1; i >= 0; i--) {
                domain = subDomain[i] + ((i == subDomain.length - 1 ? "" : ".")) + domain;
                map.put(domain, map.getOrDefault(domain, 0) + Integer.parseInt(t[0]));
            }
        }
        List<String> res = new LinkedList<>();
        map.forEach((k, v) -> {
            res.add(v.toString() + " " + k);
        });

        return res;
    }
}