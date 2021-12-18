package dlangina.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import dlangina.config.SelenoidConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

  public static void config() {
    SelenoidConfig selenoid = ConfigFactory.create(SelenoidConfig.class);
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

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
