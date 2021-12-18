package dlangina.helpers;

import com.codeborne.selenide.Configuration;
import dlangina.config.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

  public static void config() {
    SelenoidConfig selenoid = ConfigFactory.create(SelenoidConfig.class);

    Configuration.startMaximized = true;
//    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
//    Configuration.remote = format("https://%s:%s@%s", selenoid.login(),
//                                  selenoid.password(), System.getProperty("selenoidUrl")
//                                 );

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", true);
    Configuration.browserCapabilities = capabilities;
  }


}
