class Solution {
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        StringBuffer sb = new StringBuffer();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Jan", "01");hashMap.put("Feb", "02");hashMap.put("Mar", "03");
        hashMap.put("Apr", "04");hashMap.put("May", "05");hashMap.put("Jun", "06");
        hashMap.put("Jul", "07");hashMap.put("Aug", "08");hashMap.put("Sep", "09");
        hashMap.put("Oct", "10");hashMap.put("Nov", "11");hashMap.put("Dec", "12");

        sb.append(s[2]);
        sb.append("-");
        sb.append(hashMap.get(s[1]));
        sb.append("-");
        s[0] = s[0].substring(0, s[0].length() - 2);
        if (s[0].length() == 1) {
            sb.append("0");
        }
        sb.append(s[0]);
        return sb.toString();
    }
}