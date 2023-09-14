import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int p = scanner.nextInt();

int wolf = p/2; 
int les = 10; 

if (wolf >= les) { 
    System.out.println("Выгоднее отдать леснику и останется " + (p-10) + " пирожков"); 
} else { 
    System.out.println("Выгоднее волку, он получит " + (p - wolf) + " пирожков"); 
}
}
}
