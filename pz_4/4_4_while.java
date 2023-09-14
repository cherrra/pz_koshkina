import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            sum += num;
            count++;
            num = scanner.nextInt();
        }
        System.out.println((double)sum/count);
    }
}

