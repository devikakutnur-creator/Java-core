import java.util.Scanner;
class CountVowelsMethod {
static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("Number of vowels = " + countVowels(input));
   sc.close();
    }
}

