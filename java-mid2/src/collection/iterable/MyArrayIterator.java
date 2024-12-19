package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        boolean result = currentIndex < targetArr.length - 1;
        return false;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
