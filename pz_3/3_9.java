import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int a = scanner.nextInt();

        if (a >= 18) {
          System.out.println("Вы совершеннолетний");
        } elseSystem.out.println("Вы несовершеннолетнй");
    }
}

