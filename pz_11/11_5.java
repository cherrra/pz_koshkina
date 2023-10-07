import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
        int marshrut = countMarshrut(n);
        System.out.println("Число всевозможных маршрутов: " + marshrut);
    }
    
public static int countMarshrut(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2; 
        }
        
        return countMarshrut(n - 1) + countMarshrut(n - 2) + countMarshrut(n - 3);
    }
}
