import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); 
        String strr = ""; 
        int x_2 = x;
        for (int y = 0; y < x; x /= 2){
            strr += x % 2;
        }
        System.out.println("Число " + x_2 + " в двоичной системе - " + strr);
    }
}
