package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hasIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        if (bucket.contains(value)) {
            System.out.println("중복되는 수가 입력되었습니다. : " + value);
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hasIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hasIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hasIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hasIndex];
        boolean remove = bucket.remove(value);
        if (remove) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
