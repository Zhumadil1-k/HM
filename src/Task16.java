import java.util.HashMap;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String[] input = scanner.nextLine().split("\\s+");

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Введите target:");
        int target = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Индексы: " + map.get(complement) + " и " + i);
                found = true;
                break;
            }

            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("Пара не найдена.");
        }

        scanner.close();
    }
}

