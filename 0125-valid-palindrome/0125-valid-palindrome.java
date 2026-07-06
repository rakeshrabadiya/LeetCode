class Solution {
    public boolean isLetterOrDigit(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9');
    }
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (!isLetterOrDigit(ch1)) {
                i++;
                continue;
            }
            if (!isLetterOrDigit(ch2)) {
                j--;
                continue;
            }
            if (ch1 >= 'A' && ch1 <= 'Z') {
                ch1 = (char)(ch1 + 32);
            }
            if (ch2 >= 'A' && ch2 <= 'Z') {
                ch2 = (char)(ch2 + 32);
            }
            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}