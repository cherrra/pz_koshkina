import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Введите слова. Для завершения введите 'СТОП'.");

        for (String word = ""; !word.equals("СТОП"); word = scanner.nextLine()) {
            if (word.equals("Куб")) {
                found = true;
                break; 
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
