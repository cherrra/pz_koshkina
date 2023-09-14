import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Час, в который нужно проснуться: ");
        int h = scanner.nextInt();
        
        System.out.print("Минуты: ");
        int m = scanner.nextInt();
        
        System.out.print("Время на часах: ");
        int x = scanner.nextInt();

        int probujdenie = h * 3600 + m * 60; 
        int tekyshee = x * 3600;  
        if (probujdenie <= tekyshee) {
            System.out.println("Опоздал");
        } else {
            System.out.println("Успел");
}
}
}
