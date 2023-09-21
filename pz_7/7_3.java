import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву Маши:");
        String mashalet = scanner.nextLine();
        System.out.println("Введите букву Олега:");
        String oleglet = scanner.nextLine();
        System.out.println("Введите строку:");
        String words = scanner.nextLine();
        String[] wordList = words.split(" ");
        int mashaCount = 0;
        int olegCount = 0;
        for (String word : wordList) {
            if (word.startsWith(mashalet) && word.endsWith(oleglet)) {
                mashaCount++;
            }
            if (word.startsWith(oleglet) && word.endsWith(mashalet)) {
                olegCount++;
            }
        }
        System.out.println("Слова Маши: " + mashaCount);
        System.out.println("Слова Олега: " + olegCount);
    }
}
