public class ArraysAndStrings {

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
}