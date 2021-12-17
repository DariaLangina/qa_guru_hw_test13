package dlangina.properties;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Configuration.browserVersion;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemProperties {


  @Test
  @Tag("properties")
  void someTest() {
    System.out.println("Hello world!");
//    System.out.println(browser);
//    System.out.println(browserVersion);
//    System.out.println(browserSize);
  }
}
