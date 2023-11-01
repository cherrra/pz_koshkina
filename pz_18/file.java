import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/input.txt");
            Scanner input = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(new File("output.txt"));

            String line = input.nextLine();

            String[] parts = line.split(" ");
            double a = 0;
            double b = 0;
            String operation = parts[1];

            try {
                a = Double.parseDouble(parts[0]);
                b = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                output.println("Error! Not number");
                output.close();
                return;
            }

            double result = 0;

            if (operation.equals("+")) {
                result = a + b;
            } else if (operation.equals("-")) {
                result = a - b;
            } else if (operation.equals("*")) {
                result = a * b;
            } else if (operation.equals("/")) {
                if (b == 0) {
                    output.println("Error! Division by zero");
                    output.close();
                    return;
                }
                result = a / b;
            } else {
                output.println("Operation Error!");
                output.close();
                return;
            }

            output.println(result);
            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
