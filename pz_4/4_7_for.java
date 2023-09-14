import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        boolean foundKub = false;

        for (int i = 1; ; i++) { 
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("СТОП")) {
                break;
            }

            if (word.equals("ээээ") || word.equals("нууу")) {
                continue;
            }

            if (word.equalsIgnoreCase("Куб")) {
                f = true;
                System.out.println("Слово 'Куб' было введено как " + i + " нормальное слово");
                break;
            }
        }

        if (!f) {
            System.out.println("NO");
        }
    }
}
