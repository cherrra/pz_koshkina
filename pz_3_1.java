import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 строки:");
        Scanner scanner = new Scanner(System.in);

        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();
        String stroka3 = scanner.nextLine();

        if (stroka1.equals(stroka2) && stroka2.equals(stroka3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
