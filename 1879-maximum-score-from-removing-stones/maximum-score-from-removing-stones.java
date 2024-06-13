class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
        int counter = 0;
        pqMax.add(a);
        pqMax.add(b);
        pqMax.add(c);
        while (pqMax.peek() > 0) {
            int firstGreater = pqMax.poll() - 1;
            int secondGreater = pqMax.poll() - 1;
            if(secondGreater<0){
                break;
            }
            pqMax.add(firstGreater);
            pqMax.add(secondGreater);
            counter++;
        }
        return counter;
    }
}