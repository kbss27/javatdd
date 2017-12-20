package junit;

public class WasRun extends TestCase{

    boolean wasRun;

    public WasRun(String methodName) {
        super(methodName);
        wasRun = false;
    }


    public void testMethod() {
        wasRun = true;
    }
}
