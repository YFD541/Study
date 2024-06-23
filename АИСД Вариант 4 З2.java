import java.util.Scanner;

public class Main {
    
    public static void printNumberSeries(int start, int step, int count) {
        int currentNumber = start;
        for (int i = 0; i < count; i++) {
            System.out.print(currentNumber + " ");
            currentNumber += step;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало ряда: ");
        int start = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        System.out.print("Введите количество шагов: ");
        int count = scanner.nextInt();

        System.out.println("Ряд чисел:");
        printNumberSeries(start, step, count);
    }
}