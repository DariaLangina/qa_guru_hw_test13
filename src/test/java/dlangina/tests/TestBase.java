package dlangina.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import dlangina.helpers.Attach;
import dlangina.helpers.DriverSettings;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({AllureJunit5.class})
public class TestBase {

  @BeforeAll
  public static void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    DriverSettings.config();
  }

  @AfterEach
  public void tearDown() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
//    Selenide.closeWebDriver();
  }
}

