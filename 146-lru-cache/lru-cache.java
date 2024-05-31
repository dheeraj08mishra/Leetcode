class LRUCache {
    final int cache_capacity;
    Deque<Integer> q;
    Map<Integer, Integer> hm;

    public LRUCache(int capacity) {
        cache_capacity = capacity;
        q = new LinkedList<>();
        hm = new HashMap<>();
    }

    public int get(int key) {
        if (!hm.containsKey(key)) {
            return -1;
        }

        q.remove(key);
        q.addFirst(key);
        return hm.get(key);
    }

    public void put(int key, int value) {
        if (!hm.containsKey(key)) {
            if (q.size() == cache_capacity) {
                int oldestKey = q.removeLast();
                hm.remove(oldestKey);
            }
        } else {
            q.remove(key);
        }
        q.addFirst(key);
        hm.put(key, value);
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */