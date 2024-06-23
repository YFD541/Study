import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        while (n > 0) {
            if (n % 2 == 0) {
                if (n == 2 || n % 4 == 0) {
                    n = n - 1;
                } else {
                    n = n / 2;
                }
            } else {
                n = n - 1;
            }

            System.out.println("Осталось " + n + " палочек");
        }

        System.out.println("Игра завершена!");
    }
}