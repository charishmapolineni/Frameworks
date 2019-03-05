package Com.log4jdemo;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class log4jconfig {
	final static Logger logger = Logger.getLogger(HybridTest.class);
  @Test
  public void testMethod() {
	  
	  logger.info("Executed the Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  logger.warn("warning message");
  }
  @AfterMethod
  public void aftermethod() {
	  logger.error("error message");
	  logger.error(e);
  }
  }
}

