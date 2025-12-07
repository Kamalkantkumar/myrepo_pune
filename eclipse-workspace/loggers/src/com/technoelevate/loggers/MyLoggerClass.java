package com.technoelevate.loggers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class MyLoggerClass {

	final static Logger logger = Logger.getLogger(MyLoggerClass.class.getName());

	public static void main(String[] args) {
		
		logger.setLevel(Level.ALL);
		
		ConsoleHandler consoleHandler=new ConsoleHandler();
		//consoleHandler.add
		//logger.addHandler(consoleHandler);
		
//		XMLFormatter formatter=new XMLFormatter();
//		logger.addHandler(formatter);
		
//		SimpleFormatter formatter =new SimpleFormatter();
//		consoleHandler.setFormatter(formatter);
//		
//		MyFormatter formatter=new MyFormatter();
//		+
		
		logger.finest("finest level msg");
		logger.finer("finer level msg");
		logger.fine("fine level msg");
		logger.config("config level msg");
		logger.info("info level msg");
		logger.warning("warning level msg");
		logger.severe("severe level msg");
				
	}

}
