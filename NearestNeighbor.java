import java.util.Scanner;

public class NearestNeighbor {

    // Finds two neighbors with the smallest distance and returns index
    public static void findClosestNeighbors() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDist = Integer.MAX_VALUE;
        int index = -1;

        // Loop through neighboring pairs
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDist) {
                minDist = diff;
                index = i;
            }
        }

        System.out.println("Closest neighboring numbers are: " + arr[index] + " and " + arr[index + 1]);
        System.out.println("Index of first number: " + index);
    }
}
