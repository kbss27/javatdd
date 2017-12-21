package junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class TestCase {
    protected String methodName;
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    TestCase(String methodName) {
        this.methodName = methodName;
    }

    protected void run(TestResult testResult) {
        testResult.startTestCount();
        setUp();
        runTestCase();
        tearDown();
    }

    void setUp() {

    }

    void runTestCase() {
        try {
            logger.info("{} execute", methodName);
            Method method = this.getClass().getMethod(methodName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void tearDown() {

    }
}
