/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int start = 1;
        int end = n;
        // if (n == 1 && guess(n) == 0) {
        //     return n;
        // }
        int mid = start + (end - start) / 2;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int currentResult = guess(mid);
            if (currentResult == 0) {
                return mid;
            } else if (currentResult == 1) {
                start = mid + 1;
            } else if (currentResult == -1) {
                end = mid - 1;
            }
        }
        return -1;
    }
}