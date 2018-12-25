public class ArraysAndStrings {

    public boolean isPermutation (String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int [] chars = new int[128];

        char[] aArr = a.toCharArray();
        int i = 0, index;
        int len = aArr.length;

        while (i < len) {
            index = (int) aArr[i];
            chars[index]++;
            i++;
        }

        int j = 0;

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