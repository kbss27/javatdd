package junit;

public class WasRun extends TestCase{

    public WasRun(String methodName) {
        super(methodName);
    }

    public void setUp() {
    }

    public void testEqual() {
        long sum = 10;
        Assert.assertTrue(sum == 10);
    }

    public void testAdd() {
        long sum = 10 + 5;
        Assert.assertTrue(sum == 15);
    }
    public static void main(String[] args) {
        new WasRun("testEqual").run();
        new WasRun("testAdd").run();
    }
}
