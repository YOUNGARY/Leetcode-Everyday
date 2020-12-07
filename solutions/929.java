class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String email : emails) {
            String[] t = email.split("@");
            String domain = t[1];
            String address = t[0].split("\\+", 2)[0];
            StringBuilder res = new StringBuilder();
            for (String addr : address.split("\\.")) {
                res.append(addr);
            }
            hashSet.add(res + "@" + domain);
        }
        return hashSet.size();
    }
}