import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll("[^a-zа-я0-9 ]", "");

        String[] words = input.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;   // <-- общее количество слов

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                totalWords++;   // считаем каждое слово
            }
        }

        System.out.println("Результат:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Общее количество слов: " + totalWords);

        scanner.close();
    }
}

