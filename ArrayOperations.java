import java.util.Scanner;

public class ArrayOperations {
    static Scanner sc = new Scanner(System.in);

    // Menu to let user select the operation
    public static void menu() {
        System.out.println("""
                1. Separate Even and Odd Numbers
                2. Find Nearest Neighbors in Array
                3. Convert Array to ArrayList and Vice Versa
                """);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> EvenOddSeparator.separateEvenOdd();
            case 2 -> NearestNeighbor.findClosestNeighbors();
            case 3 -> ArrayListConversion.convertBothWays();
            default -> System.out.println("Invalid choice!");
        }
    }
}
