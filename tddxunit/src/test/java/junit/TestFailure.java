package junit;

public class TestFailure {
    private TestCase testCase;

    TestFailure(TestCase testCase) {
        this.testCase = testCase;
    }

    String getMethodName() {
        return this.testCase.getMethodName();
    }
}
