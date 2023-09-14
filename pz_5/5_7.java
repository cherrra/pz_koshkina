import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите a и b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int[] cubes = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            cubes[i - a] = i * i * i;
        }
        
        System.out.println("Введите кол-во чисел n: ");
        int n = scanner.nextInt();
        
        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < a || num > b) {
                System.out.println("Error");
            } else {
                int index = num - a;
                System.out.println(cubes[index]);
            }
        }
    }
}
