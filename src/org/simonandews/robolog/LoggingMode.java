package org.simonandews.robolog;

/**
 * Defines ways of sending log output.
 * @author Simon Andrews
 */
public enum LoggingMode {
	/**
	 * Log messages to the console with System.out.println().
	 */
	CONSOLE,
	/**
	 * Log messages to the file.
	 */
	FILE
}