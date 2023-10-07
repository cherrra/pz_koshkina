import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] mas = new int [n][];
		for (int i = 0; i < n; i++) {
		    String line = sc.nextLine();
		    String[] numbers = line.split(" ");
		    int[] a = new int[numbers.length];
		    for (int j = 0; j < numbers.length; j++) 
		        a[j] = Integer.parseInt(numbers[j]);
		    mas[i] = a; 
		    
		}
	    int ans = find_line7(mas);
	    if (ans != -1) 
	        System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
	    else
	        System.out.println("Таких строк нет");
}
    public static int find_line7(int[][] mas) {
      for (int i = 0; i < mas.length; i++) {
          int sum = 0;
          for (int j = 0; j < mas[i].length; j++) {
              sum += mas[i][j];
          }
          if (sum % 7 == 0) {
              return i;
          }
}

    return -1;
}
}
