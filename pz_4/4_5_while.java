import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = scanner.nextInt();
        }
        System.out.println("Максимальное число: " + max);
    }
}
