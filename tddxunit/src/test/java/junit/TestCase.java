package junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
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
        try{
            runTestCase();
        } catch(InvocationTargetException ite) {
            if(isAssertionFailedError(ite)) {
                testResult.addTestFailed(this);
            } else {
                testResult.addError(this, ite);
            }
        } catch(Exception e) {
            testResult.addError(this, e);
        } finally {
            tearDown();
        }
    }

    private boolean isAssertionFailedError(InvocationTargetException ite) {
        return ite.getTargetException() instanceof AssertionFailedError;
    }

    void setUp() {

    }

    void runTestCase() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        logger.info("{} execute", methodName);
        Method method = this.getClass().getMethod(methodName, null);
        method.invoke(this, null);
    }

    void tearDown() {

    }

    String getMethodName() {
        return this.methodName;
    }
}
