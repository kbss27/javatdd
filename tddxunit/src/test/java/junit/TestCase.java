package junit;

import java.lang.reflect.Method;

public class TestCase {
    protected String methodName;

    TestCase(String methodName) {
        this.methodName = methodName;
    }

    protected void run() {
        try {
            Method method = this.getClass().getMethod(methodName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
