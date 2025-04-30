import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListConversion {

    // Demonstrates conversion from array to ArrayList and vice versa
    public static void convertBothWays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Integer[] array = new Integer[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList back to array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));
    }
}
