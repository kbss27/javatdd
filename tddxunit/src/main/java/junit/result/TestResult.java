package junit.result;

import junit.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TestResult {

    private long testCount;
    private static final Logger logger = LoggerFactory.getLogger(TestResult.class);
    private List<TestFailure> failureList;
    private List<TestError> testErrorList;

    public TestResult() {
        this.testCount = 0;
        this.failureList = new ArrayList<>();
        this.testErrorList = new ArrayList<>();
    }

    public void startTestCount() {
        this.testCount++;
    }

    public void addTestFailed(TestCase testCase) {
        failureList.add(new TestFailure(testCase));
    }

    public void addError(TestCase testCase, Exception e) {
        testErrorList.add(new TestError(testCase, e));
    }

    public void printTestCount() {
        logger.info("Total Test Count : {} testcount", this.testCount);
        logger.info("Total Test Success Count : {}", this.testCount - failureList.size() - testErrorList.size());
        logger.info("Total Test Failure Count : {}", failureList.size());
        logger.info("Total Test Error Count : {}", testErrorList.size());
    }
}
