package imagecache;

import org.ehcache.sizeof.SizeOf;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// https://github.com/ehcache/sizeof
public class LRUImageCache {
    private Deque<byte[]> objects;
    private HashMap<String, SoftReference<byte[]>> keys;
    private SizeOf sizeOf;
    private int CACHE_SIZE_IN_BYTES = 0;

    public LRUImageCache(int capacity) {
        this.objects = new ArrayDeque<>();
        this.keys = new HashMap<>();
        this.sizeOf = SizeOf.newInstance();
        this.CACHE_SIZE_IN_BYTES = capacity;
    }

    public byte[] get(String key) {
        if (!keys.containsKey(key)) {
            return new byte[]{};
        }
        byte[] value = keys.get(key).get();
        objects.remove(value);
        objects.addFirst(value);
        return value;
    }

    public void put(String key, byte[] value) {
        if ((sizeOf.deepSizeOf(objects) + sizeOf.deepSizeOf(value)) >= CACHE_SIZE_IN_BYTES) {
            keys.remove(key);
            objects.removeLast();
        }
        if (keys.containsKey(key)) {
            objects.remove(keys.get(key).get());
        }
        objects.addFirst(value);
        keys.put(key, new SoftReference<>(objects.getFirst()));
        return;
    }

    public static void main(String[] args) {
        LRUImageCache lruImageCache = new LRUImageCache(300);
        lruImageCache.sizeOf.deepSizeOf(1);
        lruImageCache.put("1", new byte[]{1, 2, 4, 5, 6, 7, 8});
        lruImageCache.put("2", new byte[]{13, 24, 45, 55, 67, 78, 89});
        lruImageCache.put("2", new byte[]{1, 5});
        lruImageCache.put("1", new byte[]{1, 2, 4, 5, 98, 6, 7, 8});
        byte[] res = lruImageCache.get("3");    // return empty byte[]
    }
}