package junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assert {
    private static final Logger logger = LoggerFactory.getLogger(Assert.class);

    private Assert() {}

    static void assertTrue(boolean condition) {
        if(!condition) {
            throw new AssertionFailedError();
        }
        logger.info("Test passed");
    }
}
