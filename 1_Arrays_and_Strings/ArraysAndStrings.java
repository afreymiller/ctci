public class ArraysAndStrings {

    /* 1.1 */
    public boolean hasUniqueCharacters(String s) {
        int [] chars = new int[128];

        char [] sArr = s.toCharArray();

        int i = 0, index;
        int sLen = sArr.length;

        /* O{n) */
        while (i < sLen) {
            index = (int) sArr[i];
            chars[index]++;

            if (chars[index] > 1) {
                return false;
            }

            i++;
        }

        return true;

        /* if they want me to do it without using a data structure,
        have to map everything onto an integer and use bit manipulation */
    }

    /* 1.2 */
    public boolean isPermutation (String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int [] chars = new int[128];

        char[] aArr = a.toCharArray();
        int i = 0, index;
        int len = aArr.length;

        /* O(n) */
        while (i < len) {
            /* Cast the character to ASCII
            equivalent then map it */
            index = (int) aArr[i];
            chars[index]++;
            i++;
        }

        int j = 0;

        /* O(n) */
        while (j < len) {
            index = (int) b.charAt(j);
            chars[index]--;
            if (chars[index] < 0) {
                return false;
            }
            j++;
        }

        return true;
    }

    /* 1.3 */
    public void urlify (char [] s, int len) {
        int spaceCount = 0, newLength, i;

        for (i = 0; i < len; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }
        }

        newLength = len + (spaceCount * 2);
        s[newLength] = '\0';

        for (i = len-1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[newLength - 1] = '0';
                s[newLength - 2] = '2';
                s[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                s[newLength - 1] = s[i];
                newLength -= 1;
            }
        }
    }
}