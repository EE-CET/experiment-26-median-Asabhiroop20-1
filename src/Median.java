import java.util.*;
public class Median {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort
        Arrays.sort(arr);

        // Step 2: Find median
        int median = arr[n / 2];

        // Output
        System.out.println(median);
    }
}