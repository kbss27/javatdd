package junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestResult {

    private long testCount;
    private static final Logger logger = LoggerFactory.getLogger(TestResult.class);


    TestResult() {
        this.testCount = 0;
    }

    void startTestCount() {
        this.testCount++;
    }

    void printTestCount() {
        logger.info("{} testcount", this.testCount);
    }

}
