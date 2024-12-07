package generic.test.ex2;

public class Pair<K, V> {
    private K value;
    private V value1;

    public K getFirst() {
        return value;
    }

    public void setFirst(K value) {
        this.value = value;
    }

    public V getSecond() {
        return value1;
    }

    public void setSecond(V value1) {
        this.value1 = value1;
    }
}
