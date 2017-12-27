package junit.result;

import junit.TestCase;

public class TestError {

    private TestCase testCase;
    private Exception exception;

    TestError(TestCase testCase, Exception exception) {
        this.testCase = testCase;
        this.exception = exception;
    }

    public String getMethodName() {
        return this.testCase.getMethodName();
    }

    Exception getException() {
        return this.exception;
    }
}
