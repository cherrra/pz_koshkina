import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int twoMax = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            if (n > max) {
                twoMax = max;
                max = n;
            } else if (n > twoMax) {
                twoMax = n;
            }
            n = scanner.nextInt();
        }
        System.out.println("Второе максимальное по величине число: " + twoMax);
    }
}
