package Com.log4jdemo;

import org.apache.log4j.Logger;

public class log4jdemo {
	final static Logger logger = Logger.getLogger(log4jdemo.class);
	public static void main(String args[])
		logger.info("log4jdemo info");
	}
	

}
