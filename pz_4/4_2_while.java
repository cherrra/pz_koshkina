import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
