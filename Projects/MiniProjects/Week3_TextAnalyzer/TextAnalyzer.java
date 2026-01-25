import java.util.Scanner;

class Analyzer {

    private String text;

    Analyzer(String text) {
        this.text = text;
    }

    int countVowels() {
        int count = 0;
        String s = text.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    int countConsonants() {
        int count = 0;
        String s = text.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' &&
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }

    int countWords() {
        if (text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }

    int countCharacters() {
        return text.length();
    }

    String reverseText() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }

    void displayAnalysis() {
        System.out.println("\nAnalysis:");
        System.out.println("Characters: " + countCharacters());
        System.out.println("Words: " + countWords());
        System.out.println("Vowels: " + countVowels());
        System.out.println("Consonants: " + countConsonants());
        System.out.println("Reversed: " + reverseText());
    }
}

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Week 3 Mini Project: Text Analyzer (OOP) ----");
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        Analyzer analyzer = new Analyzer(input);
        analyzer.displayAnalysis();

        sc.close();
    }
}
