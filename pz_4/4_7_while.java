import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        System.out.println(i);
    }
}
