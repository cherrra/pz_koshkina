import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        System.out.println(sum);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
