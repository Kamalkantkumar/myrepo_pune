package com.technoelevate.loggers;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFileClass implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		
		return (record.getLevel()==Level.INFO)?false:true;
	}

}
