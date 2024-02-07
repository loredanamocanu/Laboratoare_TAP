import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.readText();
        textProcessor.findWords();
    }
}

class TextProcessor {
    private String text;

    public void readText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        text = scanner.nextLine();
        scanner.close();
    }

    public void findWords() {
        String[] words = text.split(" "); // Împarte textul în cuvinte

        for (String word : words) {
            if (startsAndEndsWithSameLetter(word)) { // Verifică dacă cuvântul începe și se termină cu aceeași literă
                System.out.println("Cuvânt găsit: " + word);
            }
        }
    }

    private boolean startsAndEndsWithSameLetter(String word) {
        int length = word.length();


        if (word.length() >= 2 && word.substring(0, 1).equalsIgnoreCase(word.substring(length - 1))) {
            return true;
        } else {
            return false;
        }
    }
}
