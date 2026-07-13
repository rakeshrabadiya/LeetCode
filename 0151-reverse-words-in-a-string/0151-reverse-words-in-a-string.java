class Solution {
    public String reverseWords(String s) {
        int m = s.length();
        int i = m - 1;
        int j = m - 1;
        StringBuilder sb = new StringBuilder(m);
        char[] ar = s.toCharArray();
        while (i >= 0) {
            while (i >= 0 && ar[i] == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            j = i;
            while (i >= 0 && ar[i] != ' ') {
                i--;
            }

            for (int k = i + 1; k <= j; k++) {
                sb.append(ar[k]);
            }
            if (i >= 0) {
                sb.append(' ');
            }

        }
        return sb.toString().trim();
    }
}