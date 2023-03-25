import java.util.Scanner;

public class NearestNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = findNearestNeighbors(arr);
        System.out.println("The two neighboring numbers with the smallest distance are " + arr[index] + " and " + arr[index+1] + ", and their indices are " + index + " and " + (index+1));
    }

    public static int findNearestNeighbors(int[] arr) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i+1]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
