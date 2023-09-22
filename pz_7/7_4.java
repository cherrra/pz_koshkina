import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите IP-адрес: ");
        String ip = scanner.nextLine();
        String[] parts = ip.split("\\.");
        
        if (parts.length != 4) {
            System.out.println("NO");
            return;
        }
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    System.out.println("NO");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
