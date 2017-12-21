package junit;

public class TestError {

    private TestCase testCase;
    private Exception exception;

    TestError(TestCase testCase, Exception exception) {
        this.testCase = testCase;
        this.exception = exception;
    }

    String getMethodName() {
        return this.testCase.getMethodName();
    }

    Exception getException() {
        return this.exception;
    }
}
