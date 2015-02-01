# RoboLog
Java logging library. Designed for FRC robots.

```java
import org.simonandrews.robolog.*;

public class HelloWorld {
  public static void main(String[] args) {
    Logger log = new Logger("Test");  //Make an instance of the Logger
    String format = log.getFormat();  //Get the log message format
    System.out.println(format);       //Print the current log message format
    log.setFormat("[%s] %s - %s");    //Set the log message format
    log.dev("Development console");   //dev message
    log.info("Information message");  //info message
    log.warn("Warning message");      //warn message
    log.error("Error message");       //error message
    log.fatal("Fatal error message"); //fatal message
  }
}
```
