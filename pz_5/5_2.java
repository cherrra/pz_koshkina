import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println("Сумма четных чисел: " + sum);
        for (int i = 0; i < n; i += 2) {
            System.out.print(nums[i] + " ");
        }
    }
}
