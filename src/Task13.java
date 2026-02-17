import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Task13 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");

            String input = scanner.nextLine();

            // Приводим к одному регистру (чтобы M и m не считались разными)
            input = input.toLowerCase();

            HashMap<Character, Integer> charCount = new HashMap<>();

            // Считаем только буквы
            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }

            System.out.println("\nЧастота символов:");
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

            // Поиск самого частого символа
            char mostFrequentChar = ' ';
            int maxCount = 0;

            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentChar = entry.getKey();
                }
            }

            if (!charCount.isEmpty()) {
                System.out.println("\nЧаще всего встречается: "
                        + mostFrequentChar + " (" + maxCount + " раз)");
            } else {
                System.out.println("\nБуквы не найдены.");
            }

            scanner.close();
        }
    }

