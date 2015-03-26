package org.simonandrews.robolog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTest {
	Logger log = new Logger("JUnit Test Logger");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void logMessages() {
		log.dev("dev message");
		log.info("info message");
		log.warn("warn message");
		log.error("error message");
		log.fatal("fatal message");
	}
	
	@Test
	public void getFormatWorks() {
		log.getFormat();
	}
	
	@Test
	public void setFormatWorks() {
		log.setFormat("<%s> %s - %s");
		log.setFormat("[%s] %s - %s");
	}

}
