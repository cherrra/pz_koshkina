import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int time = ((n + k - 1) / k) * (2 * m);
        System.out.println("Время, за которое котлеты будут обжарены:" + time);
    }
}
