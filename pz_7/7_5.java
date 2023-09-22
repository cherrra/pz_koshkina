import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine().toLowerCase();
        }
        int m = scanner.nextInt();
        scanner.nextLine(); 
        String[] allergia = new String[m];
        String[] zamena = new String[m];
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" - ");
            allergia[i] = parts[0].toLowerCase();
            zamena[i] = parts[1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                book[i] = book[i].replace(allergia[j], zamena[j]);
                book[i] = book[i].replace(allergia[j].substring(0, 1).toUpperCase() + allergia[j].substring(1),
                        zamena[j].substring(0, 1).toUpperCase() + zamena[j].substring(1));
            }
            System.out.println(book[i]);
        }
    }
}
