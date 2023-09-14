import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max; 
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

System.out.println("Наибольшее число: " + max);
}
}
