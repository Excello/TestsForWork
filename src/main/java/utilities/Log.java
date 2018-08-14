package utilities;

import org.apache.log4j.Logger;

public class Log {
    private Logger log = Logger.getLogger(Log.class.getName());

    public void info(String message) {
        log.info(message);
    }

    public void warn(String message) {
        log.warn(message);
    }

    public void error(String message) {
        log.error(message);
    }

    public void fatal(String message) {
        log.fatal(message);
    }

    public void debug(String message) {
        log.debug(message);
    }
}