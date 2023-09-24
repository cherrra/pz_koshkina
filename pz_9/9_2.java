import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //подсчет кол-ва сотрудников по профессиям
        Map<String, Integer> professionCount = new HashMap<>();
        //хранение имен сотрудников по профессиям
        Map<String, StringBuilder> professionEmployees = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String profession = scanner.nextLine();

            //счетчик увел, если проф уже встречалась; если 1 раз, записываем
            if (professionCount.containsKey(profession)) {
                int count = professionCount.get(profession);
                professionCount.put(profession, count + 1);
                professionEmployees.get(profession).append(name).append("\n");
            } else {
                professionCount.put(profession, 1);
                StringBuilder employeesList = new StringBuilder(name).append("\n");
                professionEmployees.put(profession, employeesList);
            }
        }

        //проф с наибольшим кол-вом сотрудников
        String mostCommonProfession = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : professionCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonProfession = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println(maxCount);
        System.out.println(mostCommonProfession);
        System.out.print(professionEmployees.get(mostCommonProfession));
    }
}
