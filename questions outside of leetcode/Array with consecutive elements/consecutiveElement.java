import java.util.*;

class Solution {

  public int solve(int[] A) {
    Arrays.sort(A);
    int prev = A[0];
    boolean consPresent = true;
    for (int i = 1; i < A.length; i++) {
      if (prev == A[i] - 1) {
        prev = A[i];
      } else {
        consPresent = false;
        break;
      }
    }
    return consPresent ? 1 : 0;
  }
}
