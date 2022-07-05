package algorythmchallenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class LRUCache {
    private Deque<Integer> objects;
    private HashMap<Integer, Integer> keys;

    private int CACHE_SIZE = 0;

    public LRUCache(int capacity) {
        this.objects = new ArrayDeque<>();
        this.keys = new HashMap<>();
        this.CACHE_SIZE = capacity;
    }

    public int get(int key) {
        if (!keys.containsKey(key)) {
            return -1;
        }
        int value = keys.get(key);
        objects.remove(value);
        objects.addFirst(value);
        return value;
    }

    public void put(int key, int value) {
        if (objects.size() == CACHE_SIZE) {
            keys.remove(objects.getLast());
            objects.removeLast();
        }
        if(keys.containsKey(key)){
            objects.remove(keys.get(key));
            objects.addFirst(value);
            return;
        }
        objects.addFirst(value);
        keys.put(key, objects.getFirst());
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        int res = lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        res = lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        res = lRUCache.get(1);    // return -1 (not found)
        res = lRUCache.get(3);    // return 3
        res = lRUCache.get(4);    // return 4
    }
}