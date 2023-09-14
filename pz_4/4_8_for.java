import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное число: ");
        int count = 0; 
        int max = scanner.nextInt();
        for (boolean flag = true; flag == true;){
            System.out.println("Введите число (0 - stop): ");
            int x = scanner.nextInt();
            if (x == 0){
                flag = false;
            }
            if (x == max) count++;
        }
        System.out.println("Количество максимального элемента в последовательности: " + count);
    }
}
