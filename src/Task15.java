import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine().toLowerCase();

        HashMap<Character, Integer> charCount = new HashMap<>();


        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }


        Character firstUnique = null;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && charCount.get(c) == 1) {
                firstUnique = c;
                break;
            }
        }


        if (firstUnique != null) {
            System.out.println("Первый неповторяющийся символ: " + firstUnique);
        } else {
            System.out.println("None");
        }

        scanner.close();
    }
}

