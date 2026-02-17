import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("Сколько элементов добавить в первую Map? ");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.print("Введите ключ: ");
            String key = scanner.nextLine();

            System.out.print("Введите значение: ");
            int value = scanner.nextInt();
            scanner.nextLine();

            map1.put(key, value);
        }

        System.out.print("\nСколько элементов добавить во вторую Map? ");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("Введите ключ: ");
            String key = scanner.nextLine();

            System.out.print("Введите значение: ");
            int value = scanner.nextInt();
            scanner.nextLine();

            map2.put(key, value);
        }

        System.out.println("\nПервая Map: " + map1);
        System.out.println("Вторая Map: " + map2);

        System.out.println("map1.equals(map2): " + map1.equals(map2));

        System.out.println("map1.hashCode(): " + map1.hashCode());
        System.out.println("map2.hashCode(): " + map2.hashCode());

        scanner.close();
    }
}

