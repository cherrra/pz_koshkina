import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Введите длину первой стороны: ");
      int a = scanner.nextInt();
      
      System.out.print("Введите длину второй стороны: ");
      int b = scanner.nextInt();
      
      System.out.print("Введите длину третьей стороны: ");
      int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}
