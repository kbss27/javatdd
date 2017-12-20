package junit;

public class TestCaseTest extends TestCase{

    public TestCaseTest(String methodName) {
        super(methodName);
    }

    public void testRunning(){
        WasRun test = new WasRun("testMethod");
        assert test.wasRun = false;
        test.run();
        assert test.wasRun == true;
    }

    public static void main(String[] args) {
        new TestCaseTest("testRunning").testRunning();
    }
}
