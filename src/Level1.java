public class Level1 {
    public static boolean LineAnalysis(String line) {
        final int STRING_LENGTH = line.length();

        for (int i = 0; i < STRING_LENGTH / 2; i++) {
            if (line.charAt(i) != line.charAt(STRING_LENGTH - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
