import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = ss.nextInt();
        int[] m_n = new int[numb];
        for (int y = 0; y < numb; y++){
            System.out.println("Введите число: ");
            m_n[y] = ss.nextInt();
        }
        System.out.println("Введите 2 числа: ");
        int a = ss.nextInt(); int b = ss.nextInt();
        int n_for_replace = m_n[a];
        m_n[a] = m_n[b]; m_n[b] = n_for_replace;
        for (int j = 0; j < numb; j++){
            System.out.print(m_n[j] + " ");
        }
    }
}
