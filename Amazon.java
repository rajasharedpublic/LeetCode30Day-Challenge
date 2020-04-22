public class Amazon {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));


    }

    public static int indexOf(byte[] value, int valueCount, byte[] str, int strCount, int fromIndex) {
        byte first = str[0];
        int max = (valueCount - strCount);
        for (int i = fromIndex; i <= max; i++) {
            // Look for first character.
            if (value[i] != first) {
                while (++i <= max && value[i] != first);
            }
            // Found first character, now look at the rest of value
            if (i <= max) {
                int j = i + 1;
                int end = j + strCount - 1;
                for (int k = 1; j < end && value[j] == str[k]; j++, k++);
                if (j == end) {
                    // Found whole string.
                    return i;
                }
            }
        }
        return -1;
    }
}
