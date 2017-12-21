package junit;

public class WasRun extends TestCase{

    public WasRun(String methodName) {
        super(methodName);
    }

    private long base;

    @Override
    public void setUp() {
        base = 10;
    }

    public void testEqual() {
        long sum = base + 10;
        Assert.assertTrue(sum == 20);
    }

    public void testAdd() {
        long sum = base + 5;
        Assert.assertTrue(sum == 15);
    }

    @Override
    public void tearDown() {

    }

    public static void main(String[] args) {
        new WasRun("testEqual").run();
        new WasRun("testAdd").run();
    }
}
