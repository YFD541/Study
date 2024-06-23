import java.util.Scanner;

public class Main {
    public static int countOccurrences(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        System.out.print("Введите символ, количество вхождений которого нужно посчитать: ");
        char character = scanner.next().charAt(0);

        int occurrences = countOccurrences(text, character);
        System.out.println("Символ '" + character + "' встречается в строке '" + text + "' " + occurrences + " раз(а).");
    }
}