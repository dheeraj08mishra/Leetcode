import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Iterate through all possible subarrays
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                // Create and print the subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println(); // Move to the next line for the next subarray
            }
        } 
    }
}
