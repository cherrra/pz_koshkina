import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        while (a <= b) {
            if (a % 3 == 0 && a % 5 != 0) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
