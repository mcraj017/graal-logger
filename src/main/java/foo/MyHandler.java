package foo;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyHandler extends Handler {

    public MyHandler() {
        System.out.println("<init> " + getClass());
    }

    @Override
    public void publish(LogRecord record) {
        // do nothing
    }

    @Override
    public void flush() {
        // do nothing
    }

    @Override
    public void close() throws SecurityException {
        System.out.println("Closing " + getClass());
    }
}
