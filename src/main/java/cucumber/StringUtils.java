package cucumber;

public class StringUtils {
    public static int countDigits(String str) {
        return (int) str.chars().filter(Character::isDigit).count();
    }

    public static int countLetters(String str) {
        return (int) str.chars().filter(Character::isLetter).count();
    }

    public static int countSpaces(String str) {
        return (int) str.chars().filter(ch -> ch == ' ').count();
    }

    public static int countVowels(String str) {
        return (int) str.chars()
                .filter(ch -> "AEIOUaeiouАЕЁИОУЫЭЮЯаеёиоуыэюя".indexOf(ch) != -1)
                .count();
    }

    public static int getLength(String str) {
        return str.length();
    }
}