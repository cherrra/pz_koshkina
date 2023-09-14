import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Все полные квадраты нат чисел: ");
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
