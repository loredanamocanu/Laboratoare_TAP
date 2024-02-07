import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        String text = scanner.nextLine();
        scanner.close();
        findWords(text);
    }

    private static void findWords(String text) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();

            if (word.length() > 1 && word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("Cuvânt găsit: " + word);
            }
        }
    }
}
