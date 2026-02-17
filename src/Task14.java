import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел:");

        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            map.putIfAbsent(length, new ArrayList<>());
            map.get(length).add(word);
        }

        System.out.println("\nГруппировка по длине:");

        for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
            System.out.println("Length " + entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
