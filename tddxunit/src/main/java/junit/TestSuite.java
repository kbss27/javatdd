package junit;

import junit.result.TestResult;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test{

    private List<Test> testSuite;

    TestSuite() {
        testSuite = new ArrayList<>();
    }

    void addTestCase(Test test) {
        testSuite.add(test);
    }

    @Override
    public void run(TestResult testResult) {
        for(Test test : testSuite) {
            test.run(testResult);
        }
    }
}
