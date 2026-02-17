import java.util.HashMap;
import java.util.Scanner;

public class FirstPage {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Add/Update student");
            System.out.println("2 - Get student score");
            System.out.println("3 - Remove student");
            System.out.println("4 - Check if student exists");
            System.out.println("5 - Show all students");
            System.out.println("6 - Clear all");
            System.out.println("0 - Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter score: ");
                    int score = scanner.nextInt();
                    scanner.nextLine();

                    Integer oldValue = students.put(name, score);
                    if (oldValue != null) {
                        System.out.println("Updated! Old score was: " + oldValue);
                    } else {
                        System.out.println("Student added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String getName = scanner.nextLine();

                    int result = students.getOrDefault(getName, -1);
                    if (result == -1) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Score: " + result);
                    }
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();

                    Integer removed = students.remove(removeName);
                    if (removed != null) {
                        System.out.println("Removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name: ");
                    String checkName = scanner.nextLine();

                    if (students.containsKey(checkName)) {
                        System.out.println("Student exists.");
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;

                case 5:
                    System.out.println("All students: " + students);
                    System.out.println("Total count: " + students.size());
                    break;

                case 6:
                    students.clear();
                    System.out.println("All data cleared.");
                    break;

                case 0:
                    System.out.println("Program ended.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

