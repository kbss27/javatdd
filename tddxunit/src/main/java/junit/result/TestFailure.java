package junit.result;

import junit.TestCase;

public class TestFailure {
    private TestCase testCase;

    TestFailure(TestCase testCase) {
        this.testCase = testCase;
    }

    public String getMethodName() {
        return this.testCase.getMethodName();
    }
}
