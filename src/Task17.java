import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task17  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");

        String[] words = scanner.nextLine().toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        // Подсчет частоты
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nУникальные элементы (freq = 1):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\nПовторяющиеся элементы (freq > 1):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        scanner.close();
    }
}

