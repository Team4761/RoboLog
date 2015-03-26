package org.simonandrews.robolog;

import org.junit.Before;
import org.junit.Test;

public class LogManagerTest {
	@Before
	public void setUp() throws Exception {
		// Reset back to default state
		LogManager.setMinimumLevel(Level.INFO);
	}
	
	@Test
	public void setMinLogLevelWorks() {
		for(int i = 0; i < Level.values().length; i++) {
			LogManager.setMinimumLevel(Level.values()[i]);
		}
	}
}
