package org.simonandews.robolog;

public final class LogManager {
	private static int minLevel = 1; //Minimum level is INFO by default

	/**
	 * Return the number of the level that is the current minimum level to 
	 * @return Minimum level
	 */
	public static int getMinimumLevel() {
		return minLevel;
	}
	/**
	 * Sets the minimum level to view in the log.
	 * @param level Minimum level
	 */
	public static void setMinimumLevel(Level level) {
		minLevel = level.ordinal();
	}
}