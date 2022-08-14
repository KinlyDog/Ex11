public class Level1 {
    public static boolean LineAnalysis(String line) {
        int strLen = line.length();

        for (int i = 0; i < strLen / 2; i++) {
            if (line.charAt(i) != line.charAt(strLen - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
