import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива 2 числа: ");
        int x = scanner.nextInt(); 
        int y = scanner.nextInt(); 
        int[][] ms = new int[x][y];
        int max_s = 0; 
        int id_ms = 0; 
        boolean flag = true;
        for (int i = 0; i < x; i++){
            for (int k = 0; k < y; k++){
                System.out.print("Введите число: ");
                ms[i][k] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < x; i++){
            int count = 0;
            for (int k = 0; k < y; k++){
                count += ms[i][k];
            }
            if (count >= max_s){
                max_s = count;
                id_ms = i;
            }
        }
        
        System.out.println("Вывод строки массива где имеется наибольшая сумма элементов: ");
        for (int i = id_ms; flag=true;){
            for (int k = 0; k < y; k++){
                System.out.print(ms[i][k] + " ");
            }
            break;
        }
        System.out.println("\nИндекс строки: " + id_ms + "\nСумма элементов: " + max_s);
	}
}
