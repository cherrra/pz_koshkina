import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
      int n = scanner.nextInt();
      if (n % 10 == 1 && n != 11) {
        System.out.println(n + " корова");
} else if (n % 10 >= 2 && n % 10 <= 4 && (n < 10 || n > 20)) {
    System.out.println(n + " коровы");
} else {
    System.out.println(n + " коров");
    }
  }
}
