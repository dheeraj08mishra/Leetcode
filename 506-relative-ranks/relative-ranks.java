class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] score_clone = new int[score.length];
        for (int i = 0; i < score_clone.length; i++) {
            score_clone[i] = score[i];
        }
        Arrays.sort(score_clone);
        for (int i = 0; i < score_clone.length / 2; i++) {
            int temp = score_clone[i];
            score_clone[i] = score_clone[score_clone.length - 1 - i];
            score_clone[score_clone.length - 1 - i] = temp;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < score_clone.length; i++) {
            hm.put(score_clone[i], i + 1);
        }
        String[] answer = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int current = hm.get(score[i]);
            if (current == 1) {
                answer[i] = "Gold Medal";
            } else if (current == 2) {
                answer[i] = "Silver Medal";
            } else if (current == 3) {
                answer[i] = "Bronze Medal";
            } else {
                answer[i] = Integer.toString(current);
            }
        }
        return answer;
    }
}