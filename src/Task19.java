import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> students = new HashMap<>();

        System.out.print("Сколько студентов хотите добавить? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя студента: ");
            String name = scanner.nextLine();

            System.out.print("Введите балл: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            students.put(name, score);
        }

        System.out.println("\nДо удаления: " + students);

        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }

        System.out.println("После удаления (балл < 60 удалены): " + students);

        scanner.close();
    }
}

