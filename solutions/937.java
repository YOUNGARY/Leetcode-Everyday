class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            public int compare(String a, String b) {
                if (isDigitLog(a) && isDigitLog(b)) {
                    return 0;
                } else if (isDigitLog(a) && !isDigitLog(b)) {
                    return 1;
                } else if (!isDigitLog(a) && isDigitLog(b)) {
                    return -1;
                } else {
                    return strCompare(a, b);
                }
            }
        });

        return logs;
    }

    boolean isDigitLog(String log) {
        return Character.isDigit(log.split(" ")[1].charAt(0));
    }

    int strCompare(String a, String b) {
        int x = a.compareTo(b);
        a = removeIdentifier(a);
        b = removeIdentifier(b);
        if (a.equals(b)) {
            return x;
        } else {
            return a.compareTo(b);
        }
    }

    String removeIdentifier(String s) {
        return s.replaceFirst(s.split(" ")[0], "");
    }
}