package TestNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger("LoggerDemo");
		System.out.println("This is logger demo");
		
		log.info("for info only");
		log.debug("debug message");
		log.warn("warning message");
		log.error("error message");
		log.fatal("fatal msg");
	}

}
