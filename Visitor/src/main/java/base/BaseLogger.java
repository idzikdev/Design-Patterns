package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseLogger {
    protected Logger logger;

    public BaseLogger() {
        logger = LogManager.getLogger();
    }
}