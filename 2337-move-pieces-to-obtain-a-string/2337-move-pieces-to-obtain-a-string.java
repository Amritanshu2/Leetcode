class Solution {
    public boolean canChange(String start, String target) {
        int i = 0, j = 0;
        while (i < start.length() || j < target.length()) {
            while (i < start.length() && String.valueOf(start.charAt(i)).equals("_")) {
                i++;
            }
            while (j < target.length() && String.valueOf(target.charAt(j)).equals("_")) {
                j++;
            }
            if (i < start.length() && j < target.length()) {
                if (!String.valueOf(start.charAt(i)).equals(String.valueOf(target.charAt(j)))) {
                    return false;
                }
                if (String.valueOf(start.charAt(i)).equals("L") && i < j) {
                    return false;
                }
                if (String.valueOf(start.charAt(i)).equals("R") && i > j) {
                    return false;
                }
                i++;
                j++;
            } else {
                return i == start.length() && j == target.length();
            }
        }
        return true;
    }
}
