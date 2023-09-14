import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        
        System.out.print("Введите 1 число: ");
        int num = scanner.nextInt();
        
        int min = num; 
        int max = num; 
        
        for (int i = 2; i <= n; i++) {
            System.out.print("Введите " + i + " число: ");
            num = scanner.nextInt();
            
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
