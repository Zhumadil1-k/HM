import java.util.HashMap;
import java.util.Map;

public class Task20 {

    public static void main(String[] args) {

        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        // Объединяем scores2 в scores1
        for (Map.Entry<String, Integer> entry : scores2.entrySet()) {
            scores1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println("Итоговые баллы:");
        System.out.println(scores1);
    }
}
