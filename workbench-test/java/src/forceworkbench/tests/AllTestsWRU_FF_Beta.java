package forceworkbench.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AllTestsWRU_FF_Beta {
	
	private static Logger logger = Logger.getLogger(AllTestsWRU_FF_Beta.class);
	
	static {
		BasicConfigurator.configure();
	
		Configuration configWRU_FF_Beta = new Configuration();
			configWRU_FF_Beta.setUsername("admin.test.rbrainard@salesforce.com");
			configWRU_FF_Beta.setPassword("123456");
			configWRU_FF_Beta.setApiVersion("18.0");
			configWRU_FF_Beta.setInstance("NA4");
			configWRU_FF_Beta.setLoginInstance("Production Login (www)");
			
			configWRU_FF_Beta.setBaseUrl("http://localhost:8888/~ryan/workbench (trunk)/workbench/");
			configWRU_FF_Beta.setBrowser("*chrome");
			
			configWRU_FF_Beta.setIgnoredInstances(new java.util.ArrayList<String>());
			configWRU_FF_Beta.getIgnoredInstances().add("Sandbox CS4");
	
		WorkbenchSeleneseTestCase.config = configWRU_FF_Beta;
	}
	
	public static Test suite() {		
		TestSuite suite = new TestSuite("Test for forceworkbench.tests");
			suite.addTestSuite(LoginTests.class);
			suite.addTestSuite(DescribeTests.class);
			suite.addTestSuite(QueryTests.class);
		return suite;
	}

}