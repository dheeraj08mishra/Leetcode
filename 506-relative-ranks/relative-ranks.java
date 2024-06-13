class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            pqMax.add(score[i]);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            hm.put(score[i], i + 1);
        }
        String[] answer = new String[score.length];
        int counter = 0;
        while (pqMax.size() > 0) {
            int current = hm.get(pqMax.remove());
            if (counter == 0) {
                answer[current - 1] = "Gold Medal";
            } else if (counter == 1) {
                answer[current - 1] = "Silver Medal";
            } else if (counter == 2) {
                answer[current - 1] = "Bronze Medal";
            } else {
                answer[current - 1] = Integer.toString(counter + 1);
            }
            counter++;

        }
        return answer;
    }
}