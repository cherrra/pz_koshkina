import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] slova = new String[n];
        
        for (int i = 0; i < n; i++) {
            slova[i] = scanner.nextLine();
        }
        
        String a = scanner.nextLine();
        String res = String.join(a, slova);
        System.out.println(res);
    }
} 
