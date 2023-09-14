import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1; 

        System.out.println("Введите целые числа. Для завершения введите 'СТОП'.");

        for (String input = scanner.nextLine(); !input.equals("СТОП"); input = scanner.nextLine()) {
            int num = Integer.parseInt(input);
            
            if (num != 0) {
                product *= num; 
            }
        }

        System.out.println(product == 1 ? "Не найдено" : "Произведение ненулевых чисел: " + product);
    }
}
