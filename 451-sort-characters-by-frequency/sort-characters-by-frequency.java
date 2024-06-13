class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(hm.entrySet());
        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            Map.Entry<Character, Integer> entry = pq.poll();
            String keyValue = String.valueOf(entry.getKey());
            sb.append(keyValue.repeat(entry.getValue()));
        }
        return sb.toString();
    }
}