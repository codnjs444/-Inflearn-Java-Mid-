package exception.basic.unchecked;

import exception.basic.checked.MyCheckedException;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
