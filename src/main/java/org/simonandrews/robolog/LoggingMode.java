package org.simonandrews.robolog;

/**
 * Defines ways of sending log output.
 * @author Simon Andrews
 * @author Jake Kinsella
 */
@Deprecated
public enum LoggingMode {
	/**
	 * Log messages to the console with System.out.println().
	 */
	CONSOLE,
	/**
	 * Log messages to a file.
	 */
	FILE,
	/**
	 * Log messages to the console with System.out.println() and to a file.
	 */
	LOG
}