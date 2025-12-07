 package com.technoelevate.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlingDemo {
	final static Logger logger=Logger.getLogger(FileHandlingDemo.class.getName());
	  public static void main(String[] args) throws SecurityException, IOException {
		logger.setLevel(Level.ALL);
		
		FileHandler loggers=new FileHandler("D:\\venkatesh\\DCIM\\techno.txt");
		logger.addHandler(loggers);
		loggers.setLevel(Level.CONFIG);
		
		MyFileClass class1=new MyFileClass();
		
	 
		//MyFormatter formatter=new MyFormatter();
		//consoleHandler.setFormatter(formatter);
		
	logger.finest("finest level msg");
	logger.finer("finer level msg");
	logger.fine("fine level msg");
	logger.config("config level msg");
	logger.info("info level msg");
	logger.warning("warning level msg");
	logger.severe("severe level msg");
	
	}

}
