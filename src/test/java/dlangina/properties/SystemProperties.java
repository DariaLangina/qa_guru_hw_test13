package dlangina.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {


  @Test
  @Tag("properties")
  void someTest() {
    String browser = System.getProperty("browser", "chrome");
    String browserSize = System.getProperty("browserSize", "1280x1024");

    System.out.println("Hello world!!!");
    System.out.println(browser);
    System.out.println(browserSize);
  }
}
