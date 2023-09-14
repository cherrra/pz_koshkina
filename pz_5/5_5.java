import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int numb = scanner.nextInt();
        int[] n_m = new int[numb]; 
        int[] massive_m = new int[numb];
        for (int i = 0; i < numb; i++){
            System.out.println("Введите число: ");
            n_m[i] = scanner.nextInt();
        }
        for (int x = 0; x < numb; x++){
            int count = 0;
            for (int y = 0; y < numb; y++){
                if (n_m[x] == n_m[y]){
                    count += 1;
                }
                if (count > 1){
                    break;
                }
            }
            if (count == 1){
                massive_m[x] = n_m[x];
            }
        }
        System.out.println("Числа которые встречаются в массиве только 1 раз: ");
        System.out.println(massive_m.length);
        for (int i = 0; i < massive_m.length; i++){
            if (massive_m[i] != 0){
                System.out.println("Число: " + massive_m[i]);
            }
        }
    }
}
