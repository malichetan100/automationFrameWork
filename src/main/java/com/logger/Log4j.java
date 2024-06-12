package com.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	static Logger log = LogManager.getLogger(Log4j.class);
	public static void main(String[] args) {
		
		//logger.file.level = trace, debug
		//rootLogger.level = trace,debug
		
		log.trace("This is Trace Logger");
		log.info("This is Info Logger");
		log.error("This Error Logger");
		log.fatal("This is fatal Logger");
		log.warn("This is Warn Logger");
	}

}
