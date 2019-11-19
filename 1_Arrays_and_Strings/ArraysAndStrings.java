import java.lang.Math;

public class ArraysAndStrings {

    /* 1.1 */
    public boolean hasUniqueCharactersWithDataStructure(String s) {
        int [] chars = new int[128];

        char [] sArr = s.toCharArray();

        int i = 0, index;
        int sLen = sArr.length;

        /* O{n) time complexity, O(1) space complexity */
        while (i < sLen) {
            index = (int) sArr[i];
            chars[index]++;

            if (chars[index] > 1) {
                return false;
            }

            i++;
        }

        return true;
    }

    public boolean hasUniqueCharactersNoDataStructure(String s) {
        
        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }

        return true;
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

    public boolean sameLengthCheck (String a, String b) {
        boolean oneDiffHasBeenFound = false;
        int i, length = Math.min(a.length(), b.length());

        for (i = 0; i < length; i++) {  
            if (a.charAt(i) != b.charAt(i)) {
                if (oneDiffHasBeenFound) {
                    return false;
                }
                oneDiffHasBeenFound = true;
            }
        }

        return true;
    }

    public boolean diffByOneCheck (String a, String b) {
        int aIndex, bIndex;
        aIndex = 0;
        bIndex = 0;

        while (aIndex < a.length() && bIndex < b.length()) {
            if (a.charAt(aIndex) != b.charAt(bIndex)) {
                if (aIndex != bIndex) {
                    return false;
                }

                aIndex++;
            } else {
                aIndex++;
                bIndex++;
            }
        }

        return true; 
    }

    /* 1.5 */
    public boolean oneAway (String a, String b) {
        int lengthDifference = a.length() - b.length();
        if (Math.abs(lengthDifference) >= 2) {
            return false;
        }

        if (Math.abs(lengthDifference) == 0) {
            return sameLengthCheck(a, b);
        } else if (lengthDifference > 0) {
            return diffByOneCheck(a, b);
        } else {
            return diffByOneCheck(b, a);
        }
        
    }
}