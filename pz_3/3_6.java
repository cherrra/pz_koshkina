import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
}
}
}
