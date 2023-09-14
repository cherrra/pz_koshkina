import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
       System.out.print("Введите число: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n - 1; i += 2) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
